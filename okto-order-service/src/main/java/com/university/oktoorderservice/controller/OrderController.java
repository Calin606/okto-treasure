package com.university.oktoorderservice.controller;

import com.google.common.base.Supplier;
import com.university.oktoorderservice.client.InventoryClient;
import com.university.oktoorderservice.dto.OrderDto;
import com.university.oktoorderservice.model.Order;
import com.university.oktoorderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JCircuitBreaker;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JCircuitBreakerFactory;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
@Slf4j
public class OrderController {

    private final OrderRepository orderRepository;
    private final InventoryClient inventoryClient;
    private final Resilience4JCircuitBreakerFactory circuitBreakerFactory;
    private final StreamBridge streamBridge;

    @PostMapping
    public String placeOrder(@RequestBody OrderDto orderDto) {

        Resilience4JCircuitBreaker circuitBreaker = circuitBreakerFactory.create("inventory");
        java.util.function.Supplier<Boolean> booleanSupplier = () -> orderDto.getOrderLineItemsList().stream()
                .allMatch(lineItem -> inventoryClient.checkStock(lineItem.getSkuCode()));

        boolean allProductsInStock =circuitBreaker.run(booleanSupplier, throwable -> handleErrorCase());
        if(allProductsInStock) {
            Order order = new Order();
            order.setOrderLineItems(orderDto.getOrderLineItemsList());
            order.setOrderNumber(UUID.randomUUID().toString());

            orderRepository.save(order);

            log.info("Sending Order Details to Notification Service");
            streamBridge.send("notificationEventSupplier-out-0", order.getId());

            return "Order Place Successfully";
        } else {
            return "Order failed, one of the products in the order is not in stock";
        }

    }

    private Boolean handleErrorCase() {
        return false;
    }
}

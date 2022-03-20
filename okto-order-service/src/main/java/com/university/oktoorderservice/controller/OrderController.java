package com.university.oktoorderservice.controller;

import com.university.oktoorderservice.client.InventoryClient;
import com.university.oktoorderservice.dto.OrderDto;
import com.university.oktoorderservice.model.Order;
import com.university.oktoorderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
//    private final Resilience4JCircuitBreakerFactory circuitBreakerFactory;

    @PostMapping
    public String placeOrder(@RequestBody OrderDto orderDto) {

        boolean allProductsInStock = orderDto.getOrderLineItemsList().stream()
                .allMatch(orderLineItems -> inventoryClient.checkStock(orderLineItems.getSkuCode()));
        if(allProductsInStock) {
            Order order = new Order();
            order.setOrderLineItems(orderDto.getOrderLineItemsList());
            order.setOrderNumber(UUID.randomUUID().toString());

            orderRepository.save(order);

            return "Order Place Successfully";
        } else {
            return "Order failed, one of the products in the order is not in stock";
        }

    }

    private Boolean handleErrorCase() {
        return false;
    }
}

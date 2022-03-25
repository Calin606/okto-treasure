package com.university.oktoapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class OktoApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(OktoApiGatewayApplication.class, args);
    }

}

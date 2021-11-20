package com.university.oktoorderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OktoOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OktoOrderServiceApplication.class, args);
    }

}

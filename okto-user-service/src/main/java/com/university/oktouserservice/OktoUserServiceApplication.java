package com.university.oktouserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OktoUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OktoUserServiceApplication.class, args);
    }

}

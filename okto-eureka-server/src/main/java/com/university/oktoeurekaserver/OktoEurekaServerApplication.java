package com.university.oktoeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OktoEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OktoEurekaServerApplication.class, args);
    }

}

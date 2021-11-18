package com.university.oktoconfigurationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class OktoConfigurationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OktoConfigurationServerApplication.class, args);
    }

}

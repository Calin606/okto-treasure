package com.university.oktoconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class OktoConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OktoConfigServerApplication.class, args);
    }

}

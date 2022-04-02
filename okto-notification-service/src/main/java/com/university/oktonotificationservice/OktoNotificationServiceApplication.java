package com.university.oktonotificationservice;

import com.university.oktonotificationservice.senders.EmailSender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import java.util.function.Consumer;

@SpringBootApplication
@EnableEurekaClient
public class OktoNotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OktoNotificationServiceApplication.class, args);
	}

	@Bean
	public Consumer<Message<String>> notificationEventSupplier() {
		return message -> new EmailSender().sendEmail(message.getPayload());
	}

}

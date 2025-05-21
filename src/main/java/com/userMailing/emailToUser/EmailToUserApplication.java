package com.userMailing.emailToUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class EmailToUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailToUserApplication.class, args);
	}

}

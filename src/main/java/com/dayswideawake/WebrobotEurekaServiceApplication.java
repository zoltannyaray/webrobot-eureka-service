package com.dayswideawake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WebrobotEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebrobotEurekaServiceApplication.class, args);
	}
}

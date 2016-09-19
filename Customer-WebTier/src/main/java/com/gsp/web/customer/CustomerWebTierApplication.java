package com.gsp.web.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.gsp.web.customer")
public class CustomerWebTierApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerWebTierApplication.class, args);
	}
}

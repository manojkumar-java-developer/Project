package com.demo.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class StoremanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoremanagementApplication.class, args);
		System.out.println("storemanagement application has started ");
	}

}

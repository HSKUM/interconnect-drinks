package com.ibm.microservices.interconnect17.drinks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DrinksApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrinksApplication.class, args);
		System.out.println("Running "+DrinksApplication.class+" via Spring Boot!");
	}
}

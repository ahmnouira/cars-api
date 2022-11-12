package com.ahmnouira.carsapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarsApiApplication {

	private static final Logger logger = LoggerFactory.getLogger(CarsApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CarsApiApplication.class, args);
		logger.info("Application started");

	}
}

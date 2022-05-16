package com.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
public class DemotestApplication {
	private static final Logger logger = LogManager.getLogger(DemotestApplication.class);
	public static void main(String[] args) {
		logger.error("Logger in DemotestApplication");
		SpringApplication.run(DemotestApplication.class, args);
	}

}

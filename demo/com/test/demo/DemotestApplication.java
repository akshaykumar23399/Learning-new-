package com.test.demo;

@SpringBootApplication
public class DemotestApplication {
	private static final Logger logger = LogManager.getLogger(DemotestApplication.class);
	public static void main(String[] args) {
		logger.error("Logger in DemotestApplication");
		SpringApplication.run(DemotestApplication.class, args);
	}

}

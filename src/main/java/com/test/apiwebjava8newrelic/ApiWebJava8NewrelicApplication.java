package com.test.apiwebjava8newrelic;

import com.test.apiwebjava8newrelic.service.ServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiWebJava8NewrelicApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiWebJava8NewrelicApplication.class, args);
	}

	@Autowired
	ServiceTest serviceTest;

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) throws InterruptedException {
		serviceTest.test2();
		return args -> {
			System.out.println("Test");

		};
	}

}

package com.sbdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbTestingApplication.class, args);
		System.out.println("Spring Boot Testing Successfull");
	}

}

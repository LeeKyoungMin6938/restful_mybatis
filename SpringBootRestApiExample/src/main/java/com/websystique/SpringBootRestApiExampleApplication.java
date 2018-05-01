package com.websystique;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.websystique"})
public class SpringBootRestApiExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiExampleApplication.class, args);
	}
}

package com.jhsystems.colosseum.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.jhsystems.colosseum.*" })
public class ColosseumApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColosseumApplication.class, args);
	}
}

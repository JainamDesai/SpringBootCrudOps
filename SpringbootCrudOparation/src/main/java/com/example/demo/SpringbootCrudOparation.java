package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/*
 * combination of three annotation 1 Component 2 ComponentScan 3
 * EnableAutoConfiguration
 * SpringBootConfiguration
 */
@SpringBootApplication
public class SpringbootCrudOparation {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootCrudOparation.class, args);	
		
	}

}

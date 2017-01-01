package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "ask","services", "ask.models","com.example" ,"repositories"})
public class AskApplication {

	public static void main(String[] args) {
		SpringApplication.run(AskApplication.class, args);
	}
}

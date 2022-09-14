package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ExamApplication {
	
	@GetMapping("/home")
	public String home() {
		return "welcome to springboot docker";
	}

	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);
	}

}

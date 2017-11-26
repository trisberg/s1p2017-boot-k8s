package com.springdeveloper.k8s.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloApplication {

	@RestController
	class HelloController {
		@GetMapping("/hello")
		String hello() {
			return "Hello Kubernauts!";
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
}

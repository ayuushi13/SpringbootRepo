package com.example.demo12;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@RestController
public class Demo12Application {
	
	@GetMapping("/redirect")
	public String redirectToNewFile() {
		return "redirect:/index.html";
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo12Application.class, args);
	}

}
package com.example.jenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class JenkinsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsdemoApplication.class, args);
	}


	@GetMapping("/hello")
	public String arthimatic()
	{
		return "hhhhhhhhhhhhhhhhhhhhhhhhh";
	}

}

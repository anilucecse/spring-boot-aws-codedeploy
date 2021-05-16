package com.example.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsCodePipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsCodePipelineApplication.class, args);
	}
	
	@GetMapping("/message")
	public String getHeartBeatMessage() {
		return "Spring Boot Application is up in AWS Service !!" ;
	}

}

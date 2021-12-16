package com.learn.springcicdactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCicdActionsApplication {

	@GetMapping("/welcome")
	public String getMessage(){
		return "Test GitHub Actions";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCicdActionsApplication.class, args);
	}

}

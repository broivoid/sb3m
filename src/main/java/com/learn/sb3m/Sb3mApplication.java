package com.learn.sb3m;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/test")
public class Sb3mApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sb3mApplication.class, args);
	}


	@GetMapping("/test1")
	public String test(){
		return "hello";
	}

}

package com.dagrup.DevOops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevOopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevOopsApplication.class, args);
	}

}

@RestController
class TestController{
	@getMapping("/endpoint")
	public String testEndpoint(){
		return "It works!"
	}
}

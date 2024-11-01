package com.example.docker_teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerTesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerTesteApplication.class, args);
	}

	@GetMapping("/hello")
	public String seyHello(){
        return "Hello!";
    }
}

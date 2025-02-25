package com.microservice.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceStudentApplication {

	public static void main(String[] args) {
		System.out.println("hello MicroserviceStudentApplication");
		SpringApplication.run(MicroserviceStudentApplication.class, args);
	}

}

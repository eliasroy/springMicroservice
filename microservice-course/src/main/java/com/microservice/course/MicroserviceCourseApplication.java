package com.microservice.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceCourseApplication {
	public static void main(String[] args) {
		System.out.println("hello MicroserviceCourseApplication");
		SpringApplication.run(MicroserviceCourseApplication.class, args);
	}

}

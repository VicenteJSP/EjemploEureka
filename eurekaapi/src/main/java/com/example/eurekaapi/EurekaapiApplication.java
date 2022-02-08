package com.example.eurekaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaapiApplication.class, args);
	}

}

package com.mindtree.ServiceRegistry4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistry4Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistry4Application.class, args);
	}

}

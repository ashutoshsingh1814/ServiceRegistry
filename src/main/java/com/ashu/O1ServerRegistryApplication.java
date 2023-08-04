package com.ashu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class O1ServerRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(O1ServerRegistryApplication.class, args);
	}

}

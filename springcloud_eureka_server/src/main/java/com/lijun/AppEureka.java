package com.lijun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AppEureka {

	public static void main(String[] args) {
		System.out.println(111222333);
		SpringApplication.run(AppEureka.class, args);
	}

}
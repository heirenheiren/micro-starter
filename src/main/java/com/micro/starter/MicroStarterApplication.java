package com.micro.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * Hello world!
 *
 */
@EnableEurekaClient
@SpringBootApplication
public class MicroStarterApplication 
{
	public static void main(String[] args) {
		SpringApplication.run(MicroStarterApplication.class, args);
	}
}

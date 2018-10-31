package com.kaicom.springboot02config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ImportResource(locations={"classpath:beans.xml"})
public class Springboot02configApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot02configApplication.class, args);
	}
}

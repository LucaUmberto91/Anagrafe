package com.exercise01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan({"com.exercise01.controller","com.exercise01.service", "com.exercise01.admin.controller"})
public class Exercise01Application extends SpringBootServletInitializer {

	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(Exercise01Application.class);
	    }
	
	public static void main(String[] args) {
		SpringApplication.run(Exercise01Application.class, args);
	}

}

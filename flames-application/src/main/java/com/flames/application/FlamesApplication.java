package com.flames.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class FlamesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlamesApplication.class, args);
	}
}

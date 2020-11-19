package com.udec.autoreslibrosjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AutoresLibrosJpaApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(AutoresLibrosJpaApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AutoresLibrosJpaApplication.class);
	}

}

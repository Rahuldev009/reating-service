package com.microservice.RatingService1;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RatingService1Application {

	public static void main(String[] args) {
		SpringApplication.run(RatingService1Application.class, args);
	}

	@Bean
	public ModelMapper getmodelmapper() {
		return new ModelMapper();
	}

}

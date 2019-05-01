package com.viaflow.vfood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class VFoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(VFoodApplication.class, args);
	}

}

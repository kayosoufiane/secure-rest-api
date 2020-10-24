package com.indaco.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(AppApplication.class);
		application.setAdditionalProfiles("ssl");
		application.run(args);
	}

}

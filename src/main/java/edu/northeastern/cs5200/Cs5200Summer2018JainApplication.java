package edu.northeastern.cs5200;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Cs5200Summer2018JainApplication
	extends ServletInitializer {
	
	@Override
	protected SpringApplicationBuilder
		configure(SpringApplicationBuilder application) {
		return application.sources(
				Cs5200Summer2018JainApplication.class);
	}


	public static void main(String[] args) {
		SpringApplication.run(Cs5200Summer2018JainApplication.class, args);
	}
}

package com.repo.depo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.repo.depo.validator.ApplicationValidator;

@SpringBootApplication
public class RepoDepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RepoDepoApplication.class, args);
	}

	@Bean
	public ApplicationValidator beforeCreateApplicationValidator() {
		return new ApplicationValidator();
	}
}

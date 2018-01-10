package com.canerpinar.loginUserService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.canerpinar.loginUserService.entity")
@EntityScan(basePackages = "com.canerpinar.loginUserService.entity")
public class LoginUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginUserServiceApplication.class);
	}
}

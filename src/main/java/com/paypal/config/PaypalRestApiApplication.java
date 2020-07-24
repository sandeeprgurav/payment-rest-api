package com.paypal.config;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@Configuration
@ComponentScan("com.paypal.*")
@PropertySource("classpath:application.properties")
@EnableAutoConfiguration
@EnableJpaRepositories("com.paypal.*")
@EntityScan("com.paypal.*")
@EnableTransactionManagement
public class PaypalRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaypalRestApiApplication.class, args);
	}

}

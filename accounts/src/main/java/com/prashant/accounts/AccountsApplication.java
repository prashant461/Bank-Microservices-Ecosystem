package com.prashant.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*
// this needs if you create your repository , controller classes outside of subpackage where main class present
@ComponentScans({ @ComponentScan("com.eazybytes.accounts.controller") })
@EnableJpaRepositories("com.eazybytes.accounts.repository")
@EntityScan("com.eazybytes.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "Bank Accounts microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name ="Prashant Gosavi",
						email = "prashantgosavi436@gmail.com",
						url="https://www.linkedin.com/in/prashant-gosavi-aa52a721a/"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.linkedin.com/in/prashant-gosavi-aa52a721a/"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Bank Accounts microservice REST API Documentation",
				url = "https://www.linkedin.com/in/prashant-gosavi-aa52a721a/"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}

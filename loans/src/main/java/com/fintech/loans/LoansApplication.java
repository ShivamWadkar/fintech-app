package com.fintech.loans;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "Fintech Loans microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Shivam Wadkar",
						email = "shivamvwadkar@gmail.com",
						url = "https://www.dummyfintech.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.dummyfintech.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Fintech Loans microservice REST API Documentation",
				url = "https://www.dummyfintech.com/swagger-ui.html"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}
}

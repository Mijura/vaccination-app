package ftn.uns.ac.rs.mail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;


@SpringBootApplication
@EnableDiscoveryClient
@OpenAPIDefinition(info =
	@Info(title = "Mail API", version = "1.0", description = "Documentation Mail API v1.0")
)
public class MailApp {

	public static void main(String[] args) {
		SpringApplication.run(MailApp.class, args);
	}

}

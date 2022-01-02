package ftn.uns.ac.rs.immunization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;


@SpringBootApplication
@EnableDiscoveryClient
@OpenAPIDefinition(info =
	@Info(title = "Immunization Portal API", version = "1.0", description = "Documentation Immunization Portal API v1.0")
)
public class ImmunizationPortalApp {

	public static void main(String[] args) {
		SpringApplication.run(ImmunizationPortalApp.class, args);
	}

}
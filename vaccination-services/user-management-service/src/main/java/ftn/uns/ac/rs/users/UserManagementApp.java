package ftn.uns.ac.rs.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserManagementApp {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementApp.class, args);
	}

}

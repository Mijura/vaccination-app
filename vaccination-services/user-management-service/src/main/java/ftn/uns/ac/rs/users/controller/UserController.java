package ftn.uns.ac.rs.users.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	protected static Logger logger = LoggerFactory.getLogger(UserController.class.getName());
	
	@PostMapping("/register-user")
	public void registerUser(@RequestBody String user) {
		logger.info(String.format("register-user: %s", user));
		System.out.println(user);
	}

}

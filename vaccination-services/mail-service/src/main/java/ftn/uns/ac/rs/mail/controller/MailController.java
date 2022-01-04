package ftn.uns.ac.rs.mail.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

	protected static Logger logger = LoggerFactory.getLogger(MailController.class.getName());
	
	@PostMapping("/send-email")
	public void sendEmail(@RequestBody String email) {
		logger.info(String.format("send-email: %s", email));
		System.out.println(email);
	}
}

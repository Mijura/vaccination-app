package ftn.uns.ac.rs.immunization.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImmunizationPortalController {

	protected static Logger logger = LoggerFactory.getLogger(ImmunizationPortalController.class.getName());
	
	@PostMapping("/apply-for-certificate")
	public void registerUser(@RequestBody String applyDocument) {
		logger.info(String.format("apply-for-certificate: %s", applyDocument));
		System.out.println(applyDocument);
	}
}

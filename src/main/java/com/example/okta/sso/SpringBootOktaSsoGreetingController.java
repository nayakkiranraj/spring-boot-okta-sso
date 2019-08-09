package com.example.okta.sso;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootOktaSsoGreetingController {
	
	@GetMapping("/")
	public String greetUser(Principal principal) {
		return "Hello User : "+principal.getName();
	}
	
}

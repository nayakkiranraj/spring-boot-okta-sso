package com.example.okta.sso;

import java.security.Principal;

import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.resource.UserRedirectRequiredException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

@RestController
public class SpringBootOktaSsoGreetingController {
	
	@GetMapping("/")
	public String greetUser(Principal principal) {
		return "Hello User : "+principal.getName();
	}
	
	@Bean
    public SimpleMappingExceptionResolver exceptionResolver() {
        SimpleMappingExceptionResolver exceptionResolver = new SimpleMappingExceptionResolver();
           exceptionResolver
                .setExcludedExceptions(UserRedirectRequiredException.class);
        return exceptionResolver;
    }
	
}

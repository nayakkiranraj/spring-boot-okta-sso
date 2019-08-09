package com.example.okta.sso;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableOAuth2Sso
public class SpringBootOktaSsoApplicationTests {

	@Test
	public void contextLoads() {
	}

}

package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.factory.LoginRequestFactory;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

@Listeners(com.api.listeners.TestListener.class)
public class LoginAPITest {
	@Test
	public void loginTest() {
		
		
		
		LoginRequest loginRequest = LoginRequestFactory.validLogin();
				
		AuthService authService = new AuthService();
		Response response = authService.login(loginRequest);
	
		LoginResponse loginResponse = response.as(LoginResponse.class);
		
		System.out.println(loginResponse.getToken());
		
		//token assertions
		String token = response.jsonPath().getString("token");
		Assert.assertNotNull(token);
			//token should look like header.payload.signature
		Assert.assertTrue(token.split("\\.").length == 3, "Invalid JWT format");
		
		//id assertions
		int id = response.jsonPath().getInt("id");
		Assert.assertTrue(id > 0, "ID should be positive");
		Assert.assertEquals(loginResponse.getId(), 4733);

		
		//username assertions
		Assert.assertEquals(loginResponse.getUsername(), loginRequest.getUsername());
		
		//email assertions
		String email = response.jsonPath().getString("email");
		Assert.assertTrue(email.contains("@"), "Invalid email format");
		Assert.assertEquals(loginResponse.getEmail(),"merrytest@gmail.com");

		
		//Role assertions
		
		  response.then()
          .statusCode(200)
          .time(lessThan(2000L))
          .body("type", equalTo("Bearer"))
          .body("username", equalTo("klerry47"))
          .body("email", equalTo("merrytest@gmail.com"))
          .body("roles", hasItem("ROLE_USER"));
		
		
		
	}
	
}






















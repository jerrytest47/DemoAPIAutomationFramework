package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;
@Listeners(com.api.listeners.TestListener.class)
public class LoginAPITestCorrect {
	@Test
	public void loginTest() {
		LoginRequest loginRequest = new LoginRequest("jerrytest47","jellyFISH208!!");
		AuthService authService = new AuthService();
		Response response = authService.login(loginRequest);
		
		//troubleshooting response issue below
		response.then().log().all();
		
		LoginResponse loginResponse = response.as(LoginResponse.class);
		
		System.out.println(response.prettyPrint());
		System.out.println(loginResponse.getToken());
		
		Assert.assertTrue(loginResponse.getToken() != null);
		Assert.assertEquals(loginResponse.getEmail(),"jerrytest47@gmail.com");
		Assert.assertEquals(loginResponse.getId(), 4589);
		
	}
	
}






















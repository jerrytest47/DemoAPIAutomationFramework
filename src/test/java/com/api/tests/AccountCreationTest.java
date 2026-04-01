package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.request.SignUpRequestBuilderPattern;

import io.restassured.response.Response;

public class AccountCreationTest {

	@Test(description = "Verify if Account Creation API is working...")
	
	public void createAccountTest() {
		
		SignUpRequestBuilderPattern signUpRequestBuilderPattern = new SignUpRequestBuilderPattern.Builder().username("jerrytest1")
		.email("jerrytest1@gmail.com")
		.firstName("Jeremiah")
		.lastName("Test")
		.password("itsASecret1!")
		.mobileNumber("5555555556").build();
		
		AuthService authService = new AuthService();
		Response response = authService.signUp(signUpRequestBuilderPattern);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.asString().trim(), "User registered successfully!");
		
		Response loginResponse = authService.login(
			    new LoginRequest("jerrytest1", "itsASecret1!")
			);

			loginResponse.then().statusCode(200);
		
	}
	
}

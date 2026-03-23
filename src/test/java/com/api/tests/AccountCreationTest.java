package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequestBuilderPattern;

import io.restassured.response.Response;

public class AccountCreationTest {

	@Test(description = "Verify if Account Creation API is working...")
	
	public void createAccountTest() {
		
		SignUpRequestBuilderPattern signUpRequestBuilderPattern = new SignUpRequestBuilderPattern.Builder().username("klerry47")
		.email("klerrytest@gmail.com")
		.firstName("Beremiah")
		.lastName("Test")
		.password("shhhDontTell1!")
		.mobileNumber("5555555556").build();
		
		AuthService authService = new AuthService();
		Response response = authService.signUp(signUpRequestBuilderPattern);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
		
	}
	
}

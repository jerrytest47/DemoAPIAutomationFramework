package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.response.Response;

public class ForgotPasswordTest {
	
	@Test(description = "Verify if Forgot Password API is working...")
	public void changePasswordTest() {
	AuthService authService = new AuthService();
	Response response = authService.forgotPassword("jerrytest@gmail.com");
	System.out.println(response.asPrettyString());
	Assert.assertEquals(response.jsonPath().getString("message"), "If your email exists in our system, you will receive reset instructions.");
	}
	
}

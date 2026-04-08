package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.models.request.LoginRequest;
import com.api.dataproviders.AuthDataProvider;
import com.api.dataproviders.CreateUserPassDataProvider;
import com.api.models.request.CreateUserRequestBuilderPattern;
import com.api.services.AuthService;

import io.restassured.response.Response;

public class AccountCreationTest {

	@Test(dataProvider = "createUserPass", dataProviderClass = CreateUserPassDataProvider.class)
	
	public void createAccountTest(String scenario, CreateUserRequestBuilderPattern request, int expectedStatusCode) {
		
		System.out.println("Running scenario: " +scenario);
				
		AuthService authService = new AuthService();
		Response response = authService.signUp(request);
//		System.out.println("response: "+response.asPrettyString());
		
		
		Assert.assertEquals(response.asString().trim(), "User registered successfully!");
		
//		Response loginResponse = authService.login(
//			    new LoginRequest(newUser, "itsASecret1!")
//			);

//			loginResponse.then().statusCode(200);
		
	}
	
}

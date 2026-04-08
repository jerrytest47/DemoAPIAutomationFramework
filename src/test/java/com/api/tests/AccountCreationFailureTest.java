package com.api.tests;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.models.request.LoginRequest;
import com.api.dataproviders.AuthDataProvider;
import com.api.dataproviders.CreateUserFailDataProvider;
import com.api.dataproviders.CreateUserPassDataProvider;
import com.api.models.request.CreateUserRequestBuilderPattern;
import com.api.services.AuthService;

import io.restassured.response.Response;

public class AccountCreationFailureTest {

	@Test(dataProvider = "createUserFail", dataProviderClass = CreateUserFailDataProvider.class)
	
	public void createAccountTest(String scenario, CreateUserRequestBuilderPattern request, int expectedStatusCode) {
		
		System.out.println("Running scenario: " +scenario);
				
		AuthService authService = new AuthService();
		Response response = authService.signUp(request);
		System.out.println("response: "+response.asPrettyString());
		
		
		response.then()
	    .statusCode(expectedStatusCode)
	    .body("status", equalTo(400))
	    .body("error", equalTo("System Error"))
	    .body("message", equalTo("An unexpected error occurred"))
	    .body("path", containsString("/api/auth/signup"))
	    .body("solution", equalTo("Please try again later or contact support"))
	    .body("errorCode", equalTo("SYS_001"));
		
	}
	
}

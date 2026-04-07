package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.dataproviders.AuthDataProvider;
import com.api.dataproviders.LoginFailureDataProvider;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginFailureResponse;
import com.api.models.response.LoginResponse;
import com.api.services.AuthService;

import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

//Note: this api contains a Defect (High Priority)
//Reason:
//When a login contains a username or password that is blank the response is returning a 500 status code instead of a 400.
//Invalid user input should never crash the server
//This can expose instability or even security risks

@Listeners(com.api.listeners.TestListener.class)
public class LoginFailureAPITest {
	@Test(dataProvider = "loginFailureData", dataProviderClass = LoginFailureDataProvider.class)
	public void loginTest(String scenario, LoginRequest request, int expectedStatusCode) {
		
        System.out.println("Running scenario: " + scenario);
						
		AuthService authService = new AuthService();
		Response response = authService.login(request);
	
		LoginFailureResponse loginFailureResponse = response.as(LoginFailureResponse.class);
		
		//System.out.println(response.asPrettyString());
		//System.out.println(loginFailureResponse);

		response.then()
	    .statusCode(401)
	    .body("status", equalTo(401))
	    .body("error", equalTo("Invalid Credentials"))
	    .body("message", equalTo("The username or password you entered is incorrect"))
	    .body("path", containsString("/api/auth/login"))
	    .body("solution", equalTo("Please check your credentials and try again"))
	    .body("errorCode", equalTo("AUTH_002"));
	
	
		

	
	}
	}






















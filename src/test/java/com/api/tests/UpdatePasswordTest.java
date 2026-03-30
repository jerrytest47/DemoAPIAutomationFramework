package com.api.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.UpdatePasswordRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

public class UpdatePasswordTest {
	@Test
	public void changePassword() {
	AuthService authService = new AuthService();
	Response response = authService.login(new LoginRequest("klerry47","itsASecret1!"));
	
	LoginResponse loginResponse = response.as(LoginResponse.class);
	System.out.println(loginResponse);
	
	System.out.println("--------------------------------------------------------------------------------------------------------------------");
	
	UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
	response = userProfileManagementService.updatePassword(loginResponse.getToken(), new UpdatePasswordRequest("itsASecret1!", "wowYouGuessedIt1!", "wowYouGuessedIt1!"));
	assertEquals(response.statusCode(), 200);
	}
	
}

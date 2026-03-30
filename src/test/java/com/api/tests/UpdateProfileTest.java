package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.ProfileRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class UpdateProfileTest {
	@Test
	public void getProfileInfoTest() {
		
		AuthService auth = new AuthService();
		Response response = auth.login(new LoginRequest("klerry47","wowYouGuessedIt1!"));
		LoginResponse loginResponse = response.as(LoginResponse.class);		
		System.out.println(response.asPrettyString());

		System.out.println("-------------------------------------------------------------------------------------------------");
		
		UserProfileManagementService userProfileManagementService = new UserProfileManagementService();		
		response = userProfileManagementService.getProfile(loginResponse.getToken());
		System.out.println(response.asPrettyString());		
		UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
		Assert.assertEquals(userProfileResponse.getUsername(), "klerry47");
		
		System.out.println("-------------------------------------------------------------------------------------------------");
		
		
		ProfileRequest profileRequest = new ProfileRequest.Builder()
					.firstName("Jeremiah")
					.lastName("Mest")
					.email("merrytest@gmail.com")
					.mobileNumber("5555555557")
					.build();
	response =	userProfileManagementService.updateProfile(loginResponse.getToken(), profileRequest);
	System.out.println(response.asPrettyString());
		
		
	}
	
}

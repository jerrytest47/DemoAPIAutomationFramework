package com.api.factory;

import com.api.models.request.LoginRequest;

public class LoginRequestFailureFactory {

	
	public static LoginRequest invalidUsername() {
		
		return new LoginRequest("wrongusername","wowYouGuessedIt1!");
		
	}
	
	public static LoginRequest blankUsername() {
		
		return new LoginRequest("","wowYouGuessedIt1!");
		
	}
	
	public static LoginRequest invalidPassword() {
		
		return new LoginRequest("klerry47","thatsthewronganswer!1");
		
	}

public static LoginRequest blankPassword() {
	
	return new LoginRequest("klerry47","");
	
}
}

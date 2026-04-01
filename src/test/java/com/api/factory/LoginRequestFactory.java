package com.api.factory;

import com.api.models.request.LoginRequest;

public class LoginRequestFactory {

	public static LoginRequest validLogin() {
		
		return new LoginRequest("klerry47","wowYouGuessedIt1!");
		
	}
	
public static LoginRequest invalidLogin() {
		
		return new LoginRequest("klerry47","thatsthewronganswer!1");
		
	}

public static LoginRequest blankPassword() {
	
	return new LoginRequest("klerry47","");
	
}
}

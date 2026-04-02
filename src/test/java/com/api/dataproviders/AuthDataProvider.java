package com.api.dataproviders;
import org.testng.annotations.DataProvider;

import com.api.factory.LoginRequestFactory;
import com.api.models.request.LoginRequest;

public class AuthDataProvider {

	    @DataProvider(name = "loginData")
	    public static Object[][] loginData() {
	        return new Object[][]{
	                { "Valid Login", LoginRequestFactory.validLogin(), 200 },
	                { "Invalid Password", LoginRequestFactory.invalidPassword(), 401 },
	                { "Invalid Username", LoginRequestFactory.invalidUsername(), 401 },
	                { "Blank Username", LoginRequestFactory.blankUsername(), 400 },
	                { "Blank Password", LoginRequestFactory.blankPassword(), 400 }
	        };
	    }
	}
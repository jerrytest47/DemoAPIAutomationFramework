package com.api.dataproviders;
import org.testng.annotations.DataProvider;

import com.api.factory.LoginRequestFactory;
import com.api.factory.LoginRequestFailureFactory;
import com.api.models.request.LoginRequest;

public class LoginFailureDataProvider {

	    @DataProvider(name = "loginFailureData")
	    public static Object[][] loginData() {
	        return new Object[][]{
	                
	                { "Invalid Password", LoginRequestFactory.invalidPassword(), 401 },
	                { "Invalid Username", LoginRequestFactory.invalidUsername(), 401 },

	        };
	    }
	}
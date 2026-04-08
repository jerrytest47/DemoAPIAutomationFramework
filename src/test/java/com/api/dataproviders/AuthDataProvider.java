package com.api.dataproviders;
import org.testng.annotations.DataProvider;

import com.api.factory.LoginRequestFactory;
import com.api.models.request.LoginRequest;

public class AuthDataProvider {

	    @DataProvider(name = "loginData")
	    public static Object[][] loginData() {
	        return new Object[][]{
	                { "Valid Login", LoginRequestFactory.validLogin(), 200 },
	                
	        };
	    }
	}
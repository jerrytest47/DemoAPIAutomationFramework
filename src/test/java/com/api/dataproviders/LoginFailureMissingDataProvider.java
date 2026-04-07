package com.api.dataproviders;
import org.testng.annotations.DataProvider;

import com.api.factory.LoginRequestFactory;
import com.api.factory.LoginRequestFailureFactory;
import com.api.models.request.LoginRequest;

public class LoginFailureMissingDataProvider {

	    @DataProvider(name = "loginFailureData")
	    public static Object[][] loginData() {
	        return new Object[][]{
	                
	          
	                { "Blank Username", LoginRequestFactory.blankUsername(), 400 },
	                { "Blank Password", LoginRequestFactory.blankPassword(), 400 }
	        };
	    }
	}
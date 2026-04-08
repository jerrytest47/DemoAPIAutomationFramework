package com.api.dataproviders;

import org.testng.annotations.DataProvider;

import com.api.factory.CreateBankAccountFactory;
import com.api.factory.CreateUserFactory;

public class CreateUserPassDataProvider {
	 @DataProvider(name = "createUserPass")
	    public static Object[][] loginData() {
	        return new Object[][]{
	                { "Valid User", CreateUserFactory.validUser(), 200 },
	                
	        };
	    }}

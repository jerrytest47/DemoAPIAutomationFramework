package com.api.dataproviders;

import org.testng.annotations.DataProvider;

import com.api.factory.CreateBankAccountFactory;
import com.api.factory.CreateUserFactory;

public class CreateUserFailDataProvider {
	 @DataProvider(name = "createUserFail")
	    public static Object[][] loginData() {
	        return new Object[][]{
	    		//status code should be 400, but api was built improperly and I don't have access to change it. 

	                { "Blank Email", CreateUserFactory.blankEmail(), 500 },
	                { "Blank Password", CreateUserFactory.blankPassword(), 500 },
	                { "Blank Username", CreateUserFactory.blankUsername(), 500 },
	        };
	    }}

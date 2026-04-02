package com.api.dataproviders;

import org.testng.annotations.DataProvider;

import com.api.factory.CreateBankAccountFactory;

public class BankAccountDataProvider {

	 @DataProvider(name = "createBankAccountData")
	    public static Object[][] loginData() {
	        return new Object[][]{
	                { "Valid Bank Data", CreateBankAccountFactory.validBankData(), 200 },
	                { "Invalid Account", CreateBankAccountFactory.invalidAccount(), 400 },
	                { "Invalid Branch", CreateBankAccountFactory.invalidBranch(), 400 },
	                { "Blank Account", CreateBankAccountFactory.blankAccount(), 400 },
	                { "Blank Branch", CreateBankAccountFactory.blankBranch(), 400 }
	        };
	    }
	
}

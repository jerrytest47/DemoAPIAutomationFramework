package com.api.dataproviders;

import org.testng.annotations.DataProvider;

import com.api.factory.BankAccountNumbersFactory;

public class GetAccountNumberDataProvider {

	 @DataProvider(name = "getBankAccountData")
	    public static Object[][] loginData() {
	        return new Object[][]{
	                { "Valid Account", BankAccountNumbersFactory.validAccount(), 200 },
	                { "Invalid Account", BankAccountNumbersFactory.invalidAccount(), 400 },
	                { "Missing Trailing Numbers", BankAccountNumbersFactory.missingTrailingNumbers(), 400 },
	                { "Blank Account", BankAccountNumbersFactory.blankAccount(), 400 },
	                { "Missing Leading Numbers", BankAccountNumbersFactory.missingLeadingNumbers(), 400 }
	        };
	    }
	
}

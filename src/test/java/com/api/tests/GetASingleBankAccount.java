package com.api.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.dataproviders.BankAccountDataProvider;
import com.api.factory.LoginRequestFactory;
import com.api.models.request.LoginRequest;
import com.api.models.response.BankAccountResponse;
import com.api.models.response.LoginResponse;
import com.api.services.AuthService;
import com.api.services.BankAccountService;

import io.restassured.response.Response;

public class GetASingleBankAccount {

	@Test(dataProvider = "getBankAccountData", dataProviderClass = BankAccountDataProvider.class)
	public void retrieveAllAccounts() {
		
			
		AuthService authService = new AuthService();
		Response response = authService.login(new LoginRequest("klerry47", "wowYouGuessedIt1!"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		
		BankAccountService bankAccountService = new BankAccountService();		
		response = bankAccountService.getAccount(loginResponse.getToken(),"4634845794");		
		BankAccountResponse bankAccountResponse = response.as(BankAccountResponse.class);
		
		Assert.assertEquals(bankAccountResponse.getAccountType(), "SAVINGS");
		Assert.assertEquals(bankAccountResponse.getStatus(), "ACTIVE");
		
	}
}

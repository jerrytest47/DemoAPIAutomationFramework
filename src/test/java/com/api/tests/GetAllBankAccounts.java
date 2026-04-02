package com.api.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.models.request.LoginRequest;
import com.api.models.response.BankAccountResponse;
import com.api.models.response.LoginResponse;
import com.api.services.AuthService;
import com.api.services.BankAccountService;

import io.restassured.response.Response;

public class GetAllBankAccounts {

	@Test
	public void retrieveAllAccounts() {
		
		AuthService authService = new AuthService();
		Response response = authService.login(new LoginRequest("klerry47", "wowYouGuessedIt1!"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		
		BankAccountService bankAccountService = new BankAccountService();		
		response = bankAccountService.getAllAccount(loginResponse.getToken());		
		List<BankAccountResponse> bankAccountResponses = response.jsonPath().getList("", BankAccountResponse.class);
		Assert.assertTrue(bankAccountResponses.size() > 0);
		Assert.assertEquals(bankAccountResponses.get(0).getStatus(), "ACTIVE");
		
	}
}

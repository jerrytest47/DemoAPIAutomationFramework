package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.BankAccountService;
import com.api.models.request.CreateBankAccountRequest;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

public class CreateBankAccountTest {
	@Test
	public void createBankAccount() {
		
		CreateBankAccountRequest createBankAccountRequest = new CreateBankAccountRequest("SALARY", "Main Branch");
		
		AuthService authService = new AuthService();
		
		Response response = authService.login(new LoginRequest("klerry47", "wowYouGuessedIt1!"));		
		LoginResponse loginResponse = response.as(LoginResponse.class);		
		//System.out.println(response.asPrettyString());
		Assert.assertTrue(loginResponse.getToken() != null);


		System.out.println("-------------------------------------------------------------------------------------------------");
		
		BankAccountService bankAccountService = new BankAccountService();
		response = bankAccountService.postAccount(loginResponse.getToken(),createBankAccountRequest);
		//response.then().log().all();
		//System.out.println(response.asPrettyString());

		
	}
	


}

package com.api.services;

import com.api.base.BaseService;
import com.api.models.request.CreateBankAccountRequest;

import io.restassured.response.Response;

public class BankAccountService extends BaseService{

	private static final String BASE_PATH = "/api/accounts";
	
	public Response postAccount(String token,CreateBankAccountRequest payload ) {
		setAuthToken(token);		
		return postRequest(payload, BASE_PATH);
		
	}
	
	public Response getAccount(String token, String account) {
		setAuthToken(token);
		return getRequest(BASE_PATH + "/"+account);
		
	}
	
	public Response getAllAccount(String token) {
		setAuthToken(token);
		return getRequest(BASE_PATH+ "/user" );
	
	}

}

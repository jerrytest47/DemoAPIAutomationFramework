package com.api.services;

import java.util.HashMap;

import com.api.base.BaseService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.request.CreateUserRequestBuilderPattern;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
public class AuthService extends BaseService{
private static final String BASE_PATH = "/api/auth/";

public Response login(LoginRequest payload) {
	return postRequest(payload, BASE_PATH+"login");	
}


public Response signUp(CreateUserRequestBuilderPattern payload) {
	return postRequest(payload, BASE_PATH+"signup");
}

public Response forgotPassword(String emailAddress) {
	HashMap<String, String> payload = new HashMap<String, String>();
	payload.put("email",emailAddress);
	return postRequest(payload, BASE_PATH+"forgot-password");
}
}

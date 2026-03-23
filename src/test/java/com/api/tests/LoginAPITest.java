package com.api.tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.response.Response.*;
import io.restassured.specification.RequestSpecification;

public class LoginAPITest {

	
@Test
public void loginTest() {
		
		
		Response response = RestAssured.given().baseUri("http://64.227.160.186:8080")
				.header("Content-Type", "application/json")
				.body("{\"username\": \"jerrytest47\", \"password\": \"jellyFISH208!!\"}").post("/api/auth/login");
		System.out.println(response.asPrettyString());
	
		Assert.assertEquals(response.getStatusCode(), 200);
				
				
				
				
				
				
				
				
				
				
				
				
	
	}
	
}

package com.api.factory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.api.models.request.CreateUserRequestBuilderPattern;

public class CreateUserFactory {
//stub
	
	 public static CreateUserRequestBuilderPattern validUser() {
	        return new CreateUserRequestBuilderPattern.Builder()
	                .username("jerrytest"+LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss")))
	                .password("Password123!")
	                .email("jerrytest"+LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"))+"@gmail.com")
	                .firstName("Jeremiah")
	                .lastName("Sprague")
	                .mobileNumber("5555555555")
	                .build();
	    }

	    public static CreateUserRequestBuilderPattern blankUsername() {
	        return new CreateUserRequestBuilderPattern.Builder()
	                .username("")
	                .password("Password123!")
	                .email("blankusername@gmail.com")
	                .firstName("Jeremiah")
	                .lastName("Sprague")
	                .mobileNumber("5555555555")
	                .build();
	    }

	    public static CreateUserRequestBuilderPattern blankPassword() {
	        return new CreateUserRequestBuilderPattern.Builder()
	                .username("userblankpass")
	                .password("")
	                .email("blankpassword@gmail.com")
	                .firstName("Jeremiah")
	                .lastName("Sprague")
	                .mobileNumber("5555555555")
	                .build();
	    }

	    public static CreateUserRequestBuilderPattern blankEmail() {
	        return new CreateUserRequestBuilderPattern.Builder()
	                .username("userblankemail")
	                .password("Password123!")
	                .email("")
	                .firstName("Jeremiah")
	                .lastName("Sprague")
	                .mobileNumber("5555555555")
	                .build();
	    }
}

package com.api.factory;

import com.api.models.request.GetBankAccountRequest;

public class BankAccountNumbersFactory{
		
	public static GetBankAccountRequest validAccount() {
		
		return new GetBankAccountRequest("4634845794");
	}
	
	public static GetBankAccountRequest invalidAccount() {
		
		return new GetBankAccountRequest("9934945797");
	}
	
	public static GetBankAccountRequest missingTrailingNumbers() {
		
		return new GetBankAccountRequest("46348457");
	}
	
	public static GetBankAccountRequest missingLeadingNumbers() {
		
		return new GetBankAccountRequest("34845794");
	}
	
	public static GetBankAccountRequest blankAccount() {
		
		return new GetBankAccountRequest("");
	}
	
}

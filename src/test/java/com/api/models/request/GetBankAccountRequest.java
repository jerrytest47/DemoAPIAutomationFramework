package com.api.models.request;

public class GetBankAccountRequest {

	private String accountNumber;

	public GetBankAccountRequest(String accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "GetBankAccountRequest [accountNumber=" + accountNumber + "]";
	}
	
}

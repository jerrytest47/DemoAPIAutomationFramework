package com.api.models.response;

public class BankAccountResponse {

	private String accountNumber;
	private String accountType;
	private String status;
	private String branch;
	private String createdAt;
	private String ownerName;
	private int balance;
	
	public BankAccountResponse() {}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public BankAccountResponse(String accountNumber, String accountType, String status, String branch, String createdAt,
			String ownerName, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.status = status;
		this.branch = branch;
		this.createdAt = createdAt;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "AccountRequest [accountNumber=" + accountNumber + ", accountType=" + accountType + ", status=" + status
				+ ", branch=" + branch + ", createdAt=" + createdAt + ", ownerName=" + ownerName + ", balance="
				+ balance + "]";
	}

	
}

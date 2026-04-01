package com.api.factory;

import com.api.models.request.CreateBankAccountRequest;

public class CreateBankAccountFactory {

    public static CreateBankAccountRequest savingsAccount() {
        return new CreateBankAccountRequest("SAVINGS", "Main Branch");
    }

    public static CreateBankAccountRequest salaryAccount() {
        return new CreateBankAccountRequest("SALARY", "Main Branch");
    }

    public static CreateBankAccountRequest blankBranch() {
        return new CreateBankAccountRequest("SAVINGS", "");
    }

    public static CreateBankAccountRequest invalidType() {
        return new CreateBankAccountRequest("INVALID_TYPE", "Main Branch");
    }
}

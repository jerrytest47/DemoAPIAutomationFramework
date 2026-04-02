package com.api.factory;

import com.api.models.request.CreateBankAccountRequest;

public class CreateBankAccountFactory {

    public static CreateBankAccountRequest validBankData() {
        return new CreateBankAccountRequest("SAVINGS", "Main Branch");
    }

    public static CreateBankAccountRequest invalidAccount() {
        return new CreateBankAccountRequest("WrongAccount", "Main Branch");
    }
    
    public static CreateBankAccountRequest blankAccount() {
        return new CreateBankAccountRequest("", "Main Branch");
    }

    public static CreateBankAccountRequest blankBranch() {
        return new CreateBankAccountRequest("SAVINGS", "");
    }

    public static CreateBankAccountRequest invalidBranch() {
        return new CreateBankAccountRequest("SAVINGS", "Wrong Branch");
    }
    


}

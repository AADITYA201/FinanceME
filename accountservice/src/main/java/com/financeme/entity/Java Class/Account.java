package com.financeme.accountservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {

    @Id
    private Long accountNo;
    private String accountHolderName;
    private String policyDetails;

    // Constructors
    public Account() {}

    public Account(Long accountNo, String accountHolderName, String policyDetails) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.policyDetails = policyDetails;
    }

    // Getters and Setters
    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getPolicyDetails() {
        return policyDetails;
    }

    public void setPolicyDetails(String policyDetails) {
        this.policyDetails = policyDetails;
    }
}

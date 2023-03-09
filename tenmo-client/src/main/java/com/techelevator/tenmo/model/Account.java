package com.techelevator.tenmo.model;

import java.math.BigDecimal;

public class Account {
    private int userId;
    private int accountId;
    private String balance;

    public Account(){}

    public Account(int userId, int accountId, String balance) {
        this.userId = userId;
        this.accountId = accountId;
        this.balance = balance;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userId=" + userId +
                ", accountId=" + accountId +
                ", balance=" + balance +
                '}';
    }
}

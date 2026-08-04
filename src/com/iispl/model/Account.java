package com.iispl.model;

import java.math.BigDecimal;

import com.iispl.enums.AccountStatus;

public class Account {

	private String accountNumber;
	private BigDecimal accountBalance;
	private AccountStatus accountStatus;
	
	public Account(String accountNumber, BigDecimal accountBalance, AccountStatus accountStatus) {
		super();
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.accountStatus = accountStatus;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	public AccountStatus getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(AccountStatus accountStatus) {
		this.accountStatus = accountStatus;
	}
	
	@Override
	public String toString() {
		return String.format("%-10s %-12s %-10s",accountNumber,accountBalance,accountStatus);
	}
}

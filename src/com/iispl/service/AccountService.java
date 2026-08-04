package com.iispl.service;

import java.math.BigDecimal;

import com.iispl.model.Account;

public interface AccountService {

	
	    void addAccount(Account account);

	    Account searchAccount(String accountNumber);

	    void updateBalance(String accountNumber, BigDecimal balance);

	    void deleteAccount(String accountNumber);

	    void displayAllAccounts();
}

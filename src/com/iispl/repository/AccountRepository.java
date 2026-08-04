package com.iispl.repository;

import java.math.BigDecimal;
import java.util.HashMap;

import com.iispl.model.Account;

public interface AccountRepository {

	 	void addAccount(Account account);

	    Account searchAccount(String accountNumber);

	    void updateBalance(String accountNumber, BigDecimal newBalance);

	    void deleteAccount(String accountNumber);

	    void displayAllAccounts();

	    HashMap<String, Account> getAllAccounts();
}

package com.iispl.service;

import java.math.BigDecimal;

import com.iispl.enums.AccountStatus;
import com.iispl.model.Account;
import com.iispl.repository.AccountRepository;
import com.iispl.repository.AccountRepositoryImpl;
import com.iispl.validator.AccountValidator;

public class AccountServiceImpl implements AccountService {
	
	  private AccountRepository repository = new AccountRepositoryImpl();

	    private AccountValidator validator = new AccountValidator();
	   

	@Override
	public void addAccount(Account account) {
		repository.addAccount(account);
		
	}

	@Override
	public Account searchAccount(String accountNumber) {
		
		return repository.searchAccount(accountNumber);
	}

	@Override
	public void updateBalance(String accountNumber, BigDecimal balance) {
		repository.updateBalance(accountNumber, balance);
		
	}

	@Override
	public void deleteAccount(String accountNumber) {
		repository.deleteAccount(accountNumber);
	}

	@Override
	public void displayAllAccounts() {
		repository.displayAllAccounts();
		
	}

}

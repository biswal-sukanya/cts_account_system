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
		// TODO Auto-generated method stub
		
	}

	@Override
	public Account searchAccount(String accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBalance(String accountNumber, BigDecimal balance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccount(String accountNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayAllAccounts() {
		// TODO Auto-generated method stub
		
	}

}

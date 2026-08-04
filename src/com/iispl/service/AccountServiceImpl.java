package com.iispl.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.iispl.model.Account;
import com.iispl.repository.AccountRepository;
import com.iispl.repository.AccountRepositoryImpl;
import com.iispl.validator.AccountBalanceValidationRule;
import com.iispl.validator.AccountNumberValidationRule;
import com.iispl.validator.AccountValidator;

public class AccountServiceImpl implements AccountService {
	
	  private AccountRepository repository = new AccountRepositoryImpl();   
	  
	  private List<AccountValidator> accountValidators = new ArrayList<>();
	  
	  public AccountServiceImpl() {

		    accountValidators.add(new AccountNumberValidationRule());
		    accountValidators.add(new AccountBalanceValidationRule());

		}
	  
	  private void validateAccount(Account account) throws Exception {

		    for(AccountValidator validator : accountValidators) {

		        validator.validate(account);

		    }

		}

	@Override
	public void addAccount(Account account) {		
		 try {

		        validateAccount(account);

		        repository.addAccount(account);

		        System.out.println("\nAccount Added Successfully.");

		    }
		    catch(Exception e) {

		        System.out.println(e.getMessage());

		    }
		
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

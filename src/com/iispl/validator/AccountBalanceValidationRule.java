package com.iispl.validator;

import java.math.BigDecimal;

import com.iispl.exception.InvalidAccountBalanceException;
import com.iispl.model.Account;

public class AccountBalanceValidationRule implements AccountValidator{

	@Override
	public void validate(Account account) throws InvalidAccountBalanceException {
		
		if(account.getAccountBalance().compareTo(BigDecimal.ZERO)<=0) {
			throw new InvalidAccountBalanceException();
		}
	}
	
}

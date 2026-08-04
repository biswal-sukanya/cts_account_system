package com.iispl.validator;

import com.iispl.exception.InvalidAccountNumberException;
import com.iispl.model.Account;

public class AccountNumberValidationRule implements AccountValidator {

	@Override
	public void validate(Account account) throws InvalidAccountNumberException{
		
		if(account.getAccountNumber().length()!=6 || account.getAccountNumber().trim().isEmpty()) {
			throw new InvalidAccountNumberException();
		}
		
	}
	
}

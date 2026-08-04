package com.iispl.validator;

import com.iispl.exception.InvalidChequeNumberException;
import com.iispl.model.Cheque;

public class ChequeNumberValidator implements ChequeValidator {

	@Override
	public void validate(Cheque cheque) throws InvalidChequeNumberException {
		if(cheque.getChequeNumber()==null || cheque.getChequeNumber().trim().isEmpty()) {
			throw new InvalidChequeNumberException();
			
		}

	}

}

package com.iispl.validator;

import java.math.BigDecimal;

import com.iispl.exception.InvalidChequeAmountException;
import com.iispl.model.Cheque;

public class ChequeAmountValidator implements ChequeValidator {

	@Override
	public void validate(Cheque cheque) throws InvalidChequeAmountException {
		if(cheque.getChequeAmount()==null||cheque.getChequeAmount().compareTo(BigDecimal.ZERO)<=0) {
			throw new InvalidChequeAmountException();
		}

	}

}

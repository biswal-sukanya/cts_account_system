package com.iispl.validator;

import com.iispl.exception.InvalidBranchException;
import com.iispl.model.Cheque;

public class BranchValidator implements ChequeValidator {

	
	@Override
	public void validate(Cheque cheque) throws InvalidBranchException {
		String branch=cheque.getBranchName();
		if(!(branch.equalsIgnoreCase("Bangalore")||branch.equalsIgnoreCase("Mysore")||branch.equalsIgnoreCase("Hubli")
				||branch.equalsIgnoreCase("Mangalore")||branch.equalsIgnoreCase("Belgaum")))
		{
			throw new InvalidBranchException();
		}
	}

	
}


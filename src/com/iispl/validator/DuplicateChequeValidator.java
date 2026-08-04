package com.iispl.validator;

import com.iispl.exception.DuplicateChequeException;
import com.iispl.model.Cheque;
import com.iispl.repository.ChequeRepository;
import com.iispl.repository.ChequeRepositoryImpl;

public class DuplicateChequeValidator implements ChequeValidator {
	
	private ChequeRepository chequeRepository=new ChequeRepositoryImpl();
	public DuplicateChequeValidator(ChequeRepository chequeRepository) {
		this.chequeRepository=chequeRepository;
	}

	@Override
	public void validate(Cheque cheque) throws DuplicateChequeException {
		if(chequeRepository.isDuplicateCheque(cheque.getChequeNumber())) {
			throw new DuplicateChequeException();
		}
		
		

	}

}

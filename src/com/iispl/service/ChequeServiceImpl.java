package com.iispl.service;

import com.iispl.model.Cheque;
import com.iispl.repository.AccountRepository;
import com.iispl.repository.AccountRepositoryImpl;
import com.iispl.repository.ChequeRepository;
import com.iispl.repository.ChequeRepositoryImpl;
import com.iispl.validator.ChequeValidator;

public class ChequeServiceImpl implements ChequeService {

	 private AccountRepository accountRepository = new AccountRepositoryImpl();

	    private ChequeRepository chequeRepository = new ChequeRepositoryImpl();

	    private ChequeValidator validator = new ChequeValidator();

		@Override
		public void processCheque(Cheque cheque) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void displayProcessedCheques() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void removeProcessedCheque(String chequeNumber) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void displayBranchReport() {
			// TODO Auto-generated method stub
			
		}
}

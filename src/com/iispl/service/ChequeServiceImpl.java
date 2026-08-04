package com.iispl.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import com.iispl.model.Cheque;
import com.iispl.repository.AccountRepository;
import com.iispl.repository.AccountRepositoryImpl;
import com.iispl.repository.ChequeRepository;
import com.iispl.repository.ChequeRepositoryImpl;
import com.iispl.validator.BranchValidator;
import com.iispl.validator.ChequeAmountValidator;
import com.iispl.validator.ChequeNumberValidator;
import com.iispl.validator.ChequeValidator;
import com.iispl.validator.DuplicateChequeValidator;


public class ChequeServiceImpl implements ChequeService {

	 private AccountRepository accountRepository = new AccountRepositoryImpl();

	    private static ChequeRepository chequeRepository = new ChequeRepositoryImpl();
	    
	    private List<ChequeValidator> chequeValidators = new ArrayList<>();
	    
	    public ChequeServiceImpl() {

	        chequeValidators.add(new ChequeNumberValidator());
	        chequeValidators.add(new ChequeAmountValidator());
	        chequeValidators.add(new BranchValidator());
	        chequeValidators.add(new DuplicateChequeValidator(chequeRepository));

	    }
	    
	    private void validateCheque(Cheque cheque) throws Exception {

	        for(ChequeValidator validator : chequeValidators) {

	            validator.validate(cheque);

	        }

	    }
	    
	    @Override
	    public void processCheque(Cheque cheque) {
	        
	        try {

	            validateCheque(cheque);

	            chequeRepository.addProcessedCheque(cheque);

	            System.out.println("Cheque Processed Successfully.");

	        }
	        catch(Exception e) {

	            System.out.println(e.getMessage());

	        }

	    }
	    @Override
	    public void displayProcessedCheques() {

	        chequeRepository.displayProcessedCheques();
	    }
	    @Override
	    public void removeProcessedCheque(String chequeNumber) {

	        chequeRepository.removeProcessedCheque(chequeNumber);
	    }

	    @Override
	    public void displayBranchReport() {

	        chequeRepository.displayBranchReport();
	    }
		@Override
		public HashSet<String> getProcessedChequeNumbers() {
			// TODO Auto-generated method stub
			return chequeRepository.getProcessedChequeNumbers();
		}

		@Override
		public TreeSet<Cheque> getProcessedCheques() {
			// TODO Auto-generated method stub
			return chequeRepository.getProcessedCheques();
		}

		@Override
		public HashMap<String, Integer> getBranchReport() {
			// TODO Auto-generated method stub
			return chequeRepository.getBranchReport();
		}

		@Override
		public boolean isDuplicateCheque(String chequeNumber) {
			// TODO Auto-generated method stub
			return chequeRepository.isDuplicateCheque(chequeNumber);
		}
}

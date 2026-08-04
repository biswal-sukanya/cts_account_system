package com.iispl.service;

// feature/remove_processed_cheques
import java.math.BigDecimal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;


import com.iispl.model.Cheque;
import com.iispl.repository.AccountRepository;
import com.iispl.repository.AccountRepositoryImpl;
import com.iispl.repository.ChequeRepository;
import com.iispl.repository.ChequeRepositoryImpl;


public class ChequeServiceImpl implements ChequeService {

	 private AccountRepository accountRepository = new AccountRepositoryImpl();

	    private ChequeRepository chequeRepository = new ChequeRepositoryImpl();
	    
		@Override
		public void processCheque(Cheque cheque) {
			
			
		}

		@Override
		public void displayProcessedCheques() {
			
			
		}

		@Override
		public void removeProcessedCheque(String chequeNumber) {
			
			
		}

		@Override
		public void displayBranchReport() {
			
			
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

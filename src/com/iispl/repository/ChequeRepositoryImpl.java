package com.iispl.repository;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

import com.iispl.model.Cheque;

public class ChequeRepositoryImpl implements ChequeRepository {

	 private HashSet<String> processedChequeNumbers = new HashSet<>();

	    private TreeSet<Cheque> processedCheques =
	            new TreeSet<>(Comparator.comparing(Cheque::getChequeAmount).reversed()
	            		       .thenComparing(Cheque::getChequeNumber));

	    private HashMap<String, Integer> branchReport =
	            new HashMap<>();

		@Override
		public boolean isDuplicateCheque(String chequeNumber) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void addProcessedCheque(Cheque cheque) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void removeProcessedCheque(String chequeNumber) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void displayProcessedCheques() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void updateBranchReport(String branchName) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void displayBranchReport() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public HashSet<String> getProcessedChequeNumbers() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TreeSet<Cheque> getProcessedCheques() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public HashMap<String, Integer> getBranchReport() {
			// TODO Auto-generated method stub
			return null;
		}
}

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
			
			return processedChequeNumbers.contains(chequeNumber);
		}

		@Override
		public void addProcessedCheque(Cheque cheque) {

		    processedChequeNumbers.add(cheque.getChequeNumber());

		    processedCheques.add(cheque);
		    
		    updateBranchReport(cheque.getBranchName());
		}
		@Override
		public void removeProcessedCheque(String chequeNumber) {
			// TODO Auto-generated method stub
			
		}

		@Override
	    public void displayProcessedCheques() {

	        System.out.printf("%-10s %-12s %-15s %-12s%n",
	                "Cheque No",
	                "Account No",
	                "Branch",
	                "Amount");

	        System.out.println("---------------------------------------------------------");

	        for (Cheque cheque : processedCheques) {

	            System.out.println(cheque);

	        }

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
		
			return processedChequeNumbers;
		}

		@Override
		public TreeSet<Cheque> getProcessedCheques() {
			
			return processedCheques;
		}

		@Override
		public HashMap<String, Integer> getBranchReport() {
			// TODO Auto-generated method stub
			return branchReport;
		}
}

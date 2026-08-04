package com.iispl.repository;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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
			
			processedChequeNumbers.remove(chequeNumber);
			
			Iterator<Cheque> itr = processedCheques.iterator();
			
			while(itr.hasNext()) {
				
				Cheque cheque = itr.next();
				
				if(cheque.getChequeNumber().equals(chequeNumber)){
					
					itr.remove();
					break;
				}
			}
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
			
			if(branchReport.containsKey(branchName)) {
				int count = branchReport.get(branchName);
				
				branchReport.put(branchName, count+1);
			}else {
				branchReport.put(branchName, 1);
			}
			
		}

		@Override
		public void displayBranchReport() {
			
			 System.out.printf("%-15s %-10s%n","Branch","Count");
		        System.out.println("---------------------------");

		        for (String branch : branchReport.keySet()) {

		            System.out.printf("%-15s %-10d%n",branch,branchReport.get(branch));

		        }

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

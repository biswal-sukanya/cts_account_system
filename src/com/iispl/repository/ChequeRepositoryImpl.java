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
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void addProcessedCheque(Cheque cheque) {
			// TODO Auto-generated method stub
			
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
			// TODO Auto-generated method stub
			
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

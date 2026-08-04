package com.iispl.repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

import com.iispl.model.Cheque;

public interface ChequeRepository {

	  boolean isDuplicateCheque(String chequeNumber);

	    void addProcessedCheque(Cheque cheque);

	    void removeProcessedCheque(String chequeNumber);

	    void displayProcessedCheques();

	    void updateBranchReport(String branchName);

	    void displayBranchReport();

	    HashSet<String> getProcessedChequeNumbers();

	    TreeSet<Cheque> getProcessedCheques();

	    HashMap<String, Integer> getBranchReport();
}

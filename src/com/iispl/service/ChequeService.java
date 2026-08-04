package com.iispl.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

import com.iispl.model.Cheque;

public interface ChequeService {

	    void processCheque(Cheque cheque);

	    void displayProcessedCheques();

	    void removeProcessedCheque(String chequeNumber);

	    void displayBranchReport();

	    HashSet<String> getProcessedChequeNumbers();
	    
	    TreeSet<Cheque> getProcessedCheques();
	    
	    HashMap<String, Integer> getBranchReport();
	    
	    boolean isDuplicateCheque(String chequeNumber);
}

package com.iispl.service;

import com.iispl.model.Cheque;

public interface ChequeService {

	 void processCheque(Cheque cheque);

	    void displayProcessedCheques();

	    void removeProcessedCheque(String chequeNumber);

	    void displayBranchReport();
}

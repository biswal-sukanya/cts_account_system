package com.iispl.main;

import java.math.BigDecimal;

import com.iispl.enums.AccountStatus;
import com.iispl.model.Account;
import com.iispl.model.Cheque;
import com.iispl.service.AccountService;
import com.iispl.service.AccountServiceImpl;
import com.iispl.service.ChequeService;
import com.iispl.service.ChequeServiceImpl;

public class CTSApplication {

	static ChequeService chequeService = new ChequeServiceImpl();
	static AccountService accountService = new AccountServiceImpl();
	
	public static void main(String[] args) {

	    int choice = 1; // Change this value to test different cases

	    do {

	        System.out.println("1. Display Accounts");
	        System.out.println("2. Search Account");
	        System.out.println("3. Update Balance");
	        System.out.println("4. Delete Account");
	        System.out.println("5. Process Cheques");
	        System.out.println("6. Display Processed Cheques");
	        System.out.println("7. Display Branch Report");
	        System.out.println("8. Exit");

	        switch(choice) {

	        case 1:
	        	accountService.displayAllAccounts();
	            break;

	        case 2:
	        	System.out.println("Enter ");
	        	accountService.searchAccount(null);
	            break;

	        case 3:
	        	accountService.updateBalance(null,null);
	            break;

	        case 4:
	        	accountService.deleteAccount(null);
	            break;

	        case 5:
	            processCheques();
	            break;

	        case 6:
	        	chequeService.displayProcessedCheques();
	            break;

	        case 7:
	        	chequeService.displayBranchReport();
	            break;

	        case 8:
	            return;
	        }

	        break;

	    } while(true);
	}
	private static void processCheques() {

	    

	    chequeService.processCheque(
	            new Cheque("CHQ001","ACC101","Bangalore",new BigDecimal("25000")));

	    chequeService.processCheque(
	            new Cheque("CHQ002","ACC102","Mysore",new BigDecimal("80000")));

	    chequeService.processCheque(
	            new Cheque("CHQ003","ACC103","Hubli",new BigDecimal("15000")));
	}
}

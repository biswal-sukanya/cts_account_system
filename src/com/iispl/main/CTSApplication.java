package com.iispl.main;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

import com.iispl.model.Account;
import com.iispl.model.Cheque;
import com.iispl.service.AccountService;
import com.iispl.service.AccountServiceImpl;
import com.iispl.service.ChequeService;
import com.iispl.service.ChequeServiceImpl;

public class CTSApplication {

	static ChequeService chequeService = new ChequeServiceImpl();
	static AccountService accountService = new AccountServiceImpl();	
	
	static List<Cheque> chequeList = List.of(
			 new Cheque("CHQ001", "ACC101", "Bangalore",new BigDecimal("25000")),
			 new Cheque("CHQ002", "ACC102", "Mysore",new BigDecimal("85000")),
			 new Cheque("CHQ003", "ACC103", "Hubli",new BigDecimal("15000")),
			 new Cheque("CHQ004", "ACC104", "Bangalore",new BigDecimal("60000")),
			 new Cheque("CHQ005", "ACC105", "Mangalore",new BigDecimal("18000")),
			 new Cheque("CHQ006", "ACC106", "Hubli",new BigDecimal("95000")),
			 new Cheque("CHQ007", "ACC107", "Mysore",new BigDecimal("12000")),
			 new Cheque("CHQ008", "ACC108", "Bangalore",new BigDecimal("50000")),
			 new Cheque("CHQ009", "ACC109", "Belgaum",new BigDecimal("70000")),
			 new Cheque("CHQ010", "ACC110", "Mangalore",new BigDecimal("30000"))
			);
	
	static Scanner sc = new Scanner(System.in);

	private static boolean chequeLoaded = false;
	
		public static void main(String[] args) {

			int choice = 0;
			

			do {

				System.out.println();
				System.out.println("  CTS BANKING SYSTEM");
				System.out.println();

				
				System.out.println("1. Display All Accounts");
				System.out.println("2. Display All Cheques");
				System.out.println("3. Search Account");
				System.out.println("4. Update Balance");
				System.out.println("5. Delete Account");
				System.out.println("6. Process Sample Cheques");
				System.out.println("7. Display Processed Cheques");
				System.out.println("8. Remove Processed Cheque");
				System.out.println("9. Display Branch Report");
				System.out.println("10. Exit");

				System.out.print("\nEnter Choice : ");

				choice = sc.nextInt();

				switch (choice) {

				case 1:

					accountService.displayAllAccounts();
					break;
					
				case 2: displayUnprocessedCheques(); break;	

				case 3:
					searchAccount();
					
					break;

				case 4:

					updateBalance();
					break;

				case 5:

					deleteAccount();
					break;

				case 6:

					processSampleCheques();
					break;

				case 7:

					chequeService.displayProcessedCheques();
					break;

				case 8:

					removeProcessedCheque();
					break;

				case 9:

					chequeService.displayBranchReport();
					break;

				case 10:

					System.out.println("Thank You...");
					break;

				default:

					System.out.println("Invalid Choice.");

				}

			} while (choice != 10);

			sc.close();
	}
		
		private static void searchAccount() {

			System.out.println("\nEnter Account Number \n");

			String accountNumber = sc.next();
			Account account = accountService.searchAccount(accountNumber);

			if (account != null) {
				System.out.printf("\n%-18s %-18s %-10s%n%n","Account Number","Account Balance","Account Status");
				System.out.println(account);

			} else {

				System.out.println("Account Not Found.");

			}

		}
		
		private static void updateBalance() {

			System.out.println("Enter Account Number ");
			String accountNumber = sc.next();
			
			System.out.println("Enter Account Balance");
			BigDecimal balance = sc.nextBigDecimal();
			
			accountService.updateBalance(accountNumber,balance);

			System.out.println("Updated Successfully.\n");

			accountService.displayAllAccounts();

		}
		
		private static void deleteAccount() {

			System.out.println("Enter Account Number ");
			String accountNumber = sc.next();
			

			accountService.deleteAccount(accountNumber);

			System.out.println("Deleted Successfully.\n");

			accountService.displayAllAccounts();

		}
		
		private static void processSampleCheques() {

			if (chequeLoaded) {
				System.out.println("Sample cheques are already processed.");
				return;
			}
			
			System.out.println("\n...");


			chequeList.forEach(cheque->{
				chequeService.processCheque(cheque);
			});

			System.out.println("\nAll Cheques Processed Successfully.");

		}
	
		private static void removeProcessedCheque() {

			System.out.println("\nRemove...\n");
			
			System.out.println("Enter Cheque Number ");
			String chequeNumber = sc.next();

			chequeService.removeProcessedCheque(chequeNumber);

			System.out.println("Cheque Removed Successfully.");

		}
		
		private static void displayUnprocessedCheques() {
			
			System.out.printf("%n%-16s %-17s %-15s %-12s%n%n","Cheque Number","Account Number","Branch Name","Cheque Amount");
			
			chequeList.forEach(cheque->{
				System.out.printf("%-16s %-17s %-15s %-12s%n",cheque.getChequeNumber(),
						cheque.getAccountNumber(),cheque.getBranchName(),cheque.getChequeAmount());
			});
		}
}

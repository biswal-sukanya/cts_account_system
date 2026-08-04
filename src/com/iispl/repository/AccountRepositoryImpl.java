package com.iispl.repository;

import java.math.BigDecimal;
import java.util.HashMap;

import com.iispl.enums.AccountStatus;
import com.iispl.model.Account;

public class AccountRepositoryImpl implements AccountRepository {

	  private static HashMap<String, Account> accountMap = new HashMap<>();

	    public AccountRepositoryImpl() {

	        accountMap.put("ACC101",
	                new Account("ACC101", new BigDecimal("25000"), AccountStatus.ACTIVE));

	        accountMap.put("ACC102",
	                new Account("ACC102", new BigDecimal("50000"), AccountStatus.ACTIVE));

	        accountMap.put("ACC103",
	                new Account("ACC103", new BigDecimal("15000"), AccountStatus.ACTIVE));

	        accountMap.put("ACC104",
	                new Account("ACC104", new BigDecimal("75000"), AccountStatus.BLOCKED));

	        accountMap.put("ACC105",
	                new Account("ACC105", new BigDecimal("35000"), AccountStatus.ACTIVE));

	        accountMap.put("ACC106",
	                new Account("ACC106", new BigDecimal("120000"), AccountStatus.ACTIVE));

	        accountMap.put("ACC107",
	                new Account("ACC107", new BigDecimal("9000"), AccountStatus.CLOSED));

	        accountMap.put("ACC108",
	                new Account("ACC108", new BigDecimal("48000"), AccountStatus.ACTIVE));

	        accountMap.put("ACC109",
	                new Account("ACC109", new BigDecimal("65000"), AccountStatus.ACTIVE));

	        accountMap.put("ACC110",
	                new Account("ACC110", new BigDecimal("18000"), AccountStatus.ACTIVE));

	    }

		@Override
		public void addAccount(Account account) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Account searchAccount(String accountNumber) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void updateBalance(String accountNumber, BigDecimal newBalance) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteAccount(String accountNumber) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void displayAllAccounts() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public HashMap<String, Account> getAllAccounts() {
			// TODO Auto-generated method stub
			return null;
		}
}

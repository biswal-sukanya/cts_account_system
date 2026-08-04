package com.iispl.model;

import java.math.BigDecimal;

import com.iispl.enums.AccountStatus;

public class Cheque {

	  private String chequeNumber;
	    private String accountNumber;
	    private String branchName;
	    private BigDecimal chequeAmount;

	    public Cheque(String chequeNumber, String accountNumber,
	                  String branchName, BigDecimal chequeAmount) {
	        super();
	        this.chequeNumber = chequeNumber;
	        this.accountNumber = accountNumber;
	        this.branchName = branchName;
	        this.chequeAmount = chequeAmount;
	    }

	    public String getChequeNumber() {
	        return chequeNumber;
	    }

	    public void setChequeNumber(String chequeNumber) {
	        this.chequeNumber = chequeNumber;
	    }

	    public String getAccountNumber() {
	        return accountNumber;
	    }

	    public void setAccountNumber(String accountNumber) {
	        this.accountNumber = accountNumber;
	    }

	    public String getBranchName() {
	        return branchName;
	    }

	    public void setBranchName(String branchName) {
	        this.branchName = branchName;
	    }

	    public BigDecimal getChequeAmount() {
	        return chequeAmount;
	    }

	    public void setChequeAmount(BigDecimal chequeAmount) {
	        this.chequeAmount = chequeAmount;
	    }

	    @Override
	    public String toString() {

	        return String.format("%-10s %-12s %-15s %-12s",
	                chequeNumber,
	                accountNumber,
	                branchName,
	                chequeAmount);

	    }
	
	
}

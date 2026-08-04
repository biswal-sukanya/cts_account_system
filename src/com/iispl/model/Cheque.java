package com.iispl.model;

import java.math.BigDecimal;

import com.iispl.enums.AccountStatus;

public class Cheque {

	private String chequeNumber;
	private BigDecimal chequeAmount;
	public Cheque(String chequeNumber, BigDecimal chequeAmount) {
		super();
		this.chequeNumber = chequeNumber;
		this.chequeAmount = chequeAmount;
	}
	public String getChequeNumber() {
		return chequeNumber;
	}
	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}
	public BigDecimal getChequeAmount() {
		return chequeAmount;
	}
	public void setChequeAmount(BigDecimal chequeAmount) {
		this.chequeAmount = chequeAmount;
	}
	
	@Override
	public String toString() {
		return String.format("%-10s %-10s",chequeNumber,chequeAmount);
	}
	
	
}

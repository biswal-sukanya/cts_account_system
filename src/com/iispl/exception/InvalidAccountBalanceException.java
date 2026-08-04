package com.iispl.exception;

public class InvalidAccountBalanceException extends Exception{
	
	public String getMessage() {
		return "invalid account balance";
	}
}

package com.iispl.exception;

public class InvalidAccountNumberException extends Exception{
	
	public String getMessage() {
		return "Invalid account number";
	}
}

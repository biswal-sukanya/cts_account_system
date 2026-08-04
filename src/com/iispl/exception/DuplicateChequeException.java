package com.iispl.exception;

public class DuplicateChequeException extends Exception {
	public String getMessage() {
		return "Duplicate Cheque Found";
	}

}

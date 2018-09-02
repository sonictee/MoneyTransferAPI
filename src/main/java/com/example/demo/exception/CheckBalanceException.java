package com.example.demo.exception;

public class CheckBalanceException extends SystemException {

	public CheckBalanceException(String message, String errorCode) {
		super(message, errorCode);
	}

}

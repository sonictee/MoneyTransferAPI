package com.example.demo.exception;

public class SystemException extends Exception {
	private final String errorCode;
	
	public String getErrorCode() {
		return errorCode;
	}

	public SystemException(String message, String errorCode) {
		super(message);

		this.errorCode = errorCode;
	}
}

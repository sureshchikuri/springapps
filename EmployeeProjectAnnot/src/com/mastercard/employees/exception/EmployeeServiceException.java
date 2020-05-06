package com.mastercard.employees.exception;

public class EmployeeServiceException extends Exception {

	private int code;
	
	public EmployeeServiceException() {
	}
	
	public EmployeeServiceException(int code,String message) {
		super(message);
		this.setCode(code);
	}
	
	public EmployeeServiceException(Throwable cause) {
		super(cause);
	}
	
	public EmployeeServiceException(int code,String message,Throwable cause) {
		super(message,cause);
		this.setCode(code);
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
	

}

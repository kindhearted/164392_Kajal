package com.example.demo.controller;

public class ErrorResponse {
	
	private int reasonCode;
	private String errorMessage;
	
	
	public int getReasonCode() {
		return reasonCode;
	}
	public void setReasonCode(int i) {
		this.reasonCode = i;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	

}

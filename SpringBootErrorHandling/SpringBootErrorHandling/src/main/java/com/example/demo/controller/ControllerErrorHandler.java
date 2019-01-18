package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerErrorHandler {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleError(Exception e) {
		
		ErrorResponse errorResp=new ErrorResponse();
		errorResp.setReasonCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		errorResp.setErrorMessage(e.getMessage());
		return new ResponseEntity<ErrorResponse>(errorResp,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}

package com.ustglobal.exception.customisedcheckedexception;

public class InvalidAmountException extends Exception {
private String message="daily limit is 40000";


	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
}

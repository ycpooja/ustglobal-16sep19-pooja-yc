package com.ustglobal.exception.customiseduncheckedexception;

public class InvalidAgeException extends RuntimeException {
	String message="Invalid age below 18years not allowed";
	
	 public InvalidAgeException() {
		// TODO Auto-generated constructor stub
	}
	public InvalidAgeException(String message){
		this.message=message;
	}
	
	
	public String toString() {
		return message;
	}
	/*
	public String getMessage(){
		return message;*/
	}


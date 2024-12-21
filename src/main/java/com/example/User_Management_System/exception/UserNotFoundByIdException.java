package com.example.User_Management_System.exception;

public class UserNotFoundByIdException extends RuntimeException{
	private final String message;
	private final String redirectTo;
	public UserNotFoundByIdException(String message, String redirectTo) {
		super();
		this.message = message;
		this.redirectTo = redirectTo;
	}
	public String getMessage() {
		return message;
	}
	public String getRedirectTo() {
		return redirectTo;
	}
	

}

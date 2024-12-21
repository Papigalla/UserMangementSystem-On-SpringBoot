package com.example.User_Management_System.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApplicationExceptionHandler {
	@ExceptionHandler
	public String handleUserNotFoundById(UserNotFoundByIdException ex,Model model)
	{
		model.addAttribute("errorMessage",ex.getMessage());
		model.addAttribute("redirectTo",ex.getRedirectTo());
		return "error.jsp";
		
	}

}

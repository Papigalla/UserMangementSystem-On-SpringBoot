package com.example.User_Management_System.service;

import java.util.List;
import java.util.*;

import org.springframework.stereotype.Service;

import com.example.User_Management_System.entity.User;
import com.example.User_Management_System.exception.UserNotFoundByIdException;
import com.example.User_Management_System.repository.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	public void addUser(User user)
	{
		userRepository.save(user);
	}
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}
	public void deleteUser(int userId) {
		userRepository.deleteById(userId);;
		
	}
	public User findUserById(int userId) {
		// return userRepository.getById(userId);
		return userRepository.findById(userId).orElseThrow(()->new UserNotFoundByIdException("Failed to find the user","display-users"));
		
	/* Optional<User> optional = userRepository.findById(userId);
	 if(optional.isPresent())
	 {
		 return optional.get();
	 }else
	 {
		 //throw new UserNotFoundByIdException();
		 return null;
	 }*/
	}

	public void updateUser(User user) {
		this.findUserById(user.getUserId());//confirm that user is present or not
		userRepository.save(user);
		
	}

	


}

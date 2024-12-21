package com.example.User_Management_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Jpa21Utils;

import com.example.User_Management_System.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	

}

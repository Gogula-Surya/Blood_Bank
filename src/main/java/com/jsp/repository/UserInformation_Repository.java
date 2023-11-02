package com.jsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.entity.UserInformation;


public interface UserInformation_Repository extends JpaRepository<UserInformation, Integer> 
{
	UserInformation  findByEmailAndPassword(String email, String password);
	
	UserInformation  findByEmail(String email);
}

package com.jsp.daoimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.UserDao;
import com.jsp.entity.UserInformation;
import com.jsp.repository.UserInformation_Repository;

@Component
public class UserDaoImple implements UserDao 
{
	@Autowired
	UserInformation_Repository userrepo;
	
	// insert values 
	@Override
	public UserInformation insertValues(UserInformation userInformation) {
		return userrepo.save(userInformation);
	}
	
	// login (if mail and password are correct we enter another page)
	@Override
	public UserInformation login(String email, String password) {
		return userrepo.findByEmailAndPassword(email, password);
	}

	@Override
	public UserInformation updatepassword(String email, String password) {
		UserInformation userInformation = userrepo.findByEmail(email);
		if (userInformation != null) {
			userInformation.setPassword(password);
			userrepo.save(userInformation);
			System.out.println("Updated password successfully....!!");
		} else {
			System.out.println("Invalid email.....!!");
		}
		return userInformation;
	}

}

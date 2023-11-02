package com.jsp.dao;

import com.jsp.entity.UserInformation;

public interface UserDao 
{
	public UserInformation insertValues(UserInformation userInformation);
	
	public UserInformation login(String email,String password);
	
	public UserInformation updatepassword(String email,String password);
}

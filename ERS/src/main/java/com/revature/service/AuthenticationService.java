package com.revature.service;


import com.revature.beans.Users;
import com.revature.daoimpl.UsersDAOImpl;

public class AuthenticationService {
	public static UsersDAOImpl ud= new UsersDAOImpl();

	public boolean authenticateUser(String username ,String password) {
		Users user= new Users();
		user=ud.getUser(username);
		
		if(username.equals(user.getUsername()) && password.equals(user.getPassword())) 	
			return true;
			else
		return false;
}
	
	
}
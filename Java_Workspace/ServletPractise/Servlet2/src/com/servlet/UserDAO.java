package com.servlet;

import java.util.ArrayList;

public class UserDAO {
	
	ArrayList<User> userList=new ArrayList();
	
	public UserDAO()
	{
		
		userList.add(new User("Kajal", "kajal", "Admin"));
		userList.add(new User("Akshay", "akshay", "User"));
		userList.add(new User("vaibhavi", "vaibhavi", "User"));
		
	}
	
	public String getUserType(String userName,String password) {
		for(User user:userList) {
			if(user.getUserName().equals(userName) && user.getPassword().equals(password))
			{
				return user.getUserType();
			}
		}
		throw new InvalidUserException("Invalid User Details!!!");
	}

}

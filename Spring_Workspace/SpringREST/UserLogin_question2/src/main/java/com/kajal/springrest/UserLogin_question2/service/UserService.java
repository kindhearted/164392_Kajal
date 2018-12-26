package com.kajal.springrest.UserLogin_question2.service;

import java.util.List;

import com.kajal.springrest.UserLogin_question2.database.UserDatabase;
import com.kajal.springrest.UserLogin_question2.model.User;

public class UserService {

	private List<User> users= UserDatabase.getUser();

	public UserService() {
		
		users.add(new User("kajal", "kajal"));
		users.add(new User("akshay", "akshay"));
	}
	
}

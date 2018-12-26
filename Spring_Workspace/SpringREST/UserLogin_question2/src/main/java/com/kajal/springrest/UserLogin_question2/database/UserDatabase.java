package com.kajal.springrest.UserLogin_question2.database;

import java.util.ArrayList;
import java.util.List;

import com.kajal.springrest.UserLogin_question2.model.User;


public class UserDatabase {

	private static List<User> users = new ArrayList();

	public static List<User> getUser() {
		return users;
	}



}

package com.onkar.util;

import com.onkar.dao.IUserDAO;
import com.onkar.dao.UserDAO;
import com.onkar.dao.UserDAOVer2;

public class DAOUtility {
	
	public static IUserDAO getUserDAO() {
		return new UserDAOVer2();
	}

}

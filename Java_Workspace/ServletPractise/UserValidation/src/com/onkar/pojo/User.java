package com.onkar.pojo;

public class User {
	
	String userName;
	String password;
	String userType;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String userName, String password, String userType) {
		super();
		this.userName = userName;
		this.password = password;
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", userType=" + userType + "]";
	}
	
	

}

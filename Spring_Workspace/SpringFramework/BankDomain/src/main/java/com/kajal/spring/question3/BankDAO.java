package com.kajal.spring.question3;

import java.util.ArrayList;

public class BankDAO {

	ArrayList<BankAccount> bankCustomer;
	
	
	public BankDAO() {
	
		//bankCustomer = new ArrayList();
		bankCustomer.add(new BankAccount(101, "Kajal", "Saving",5000));
		bankCustomer.add(new BankAccount(102, "Vaibhavi", "current",50000));	
		bankCustomer.add(new BankAccount(103, "Aby", "Saving",50));
		bankCustomer.add(new BankAccount(101, "Akshay", "Saving",10000));


	}
	
	
}

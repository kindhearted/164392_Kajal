package com.kajal.spring.question5;

import org.springframework.beans.factory.annotation.Required;

public class Employee {
	
	
	private int empId;
	private String empName;
	
	
	
	
	public int getEmpId() {
		return empId;
	}
	
	@Required
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void display() {
		System.out.println("Emp Id : "+getEmpId()+"\n Emp Name : "+getEmpName());
		
	}
	

}

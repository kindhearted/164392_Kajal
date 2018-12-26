package com.kajal.springrest.EmployeeManagementSystem.database;

import java.util.HashMap;
import java.util.Map;

import com.kajal.springrest.EmployeeManagementSystem.model.Employee;


public class EmployeeDatabase {
	
	private static Map<Long,Employee> employeeDetails = new HashMap();

	
	public static Map<Long, Employee> getEmployeeDetails() {
		return employeeDetails;
	}

	
}

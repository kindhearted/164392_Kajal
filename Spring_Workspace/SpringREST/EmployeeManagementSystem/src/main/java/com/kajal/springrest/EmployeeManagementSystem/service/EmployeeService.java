package com.kajal.springrest.EmployeeManagementSystem.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.kajal.springrest.EmployeeManagementSystem.database.EmployeeDatabase;
import com.kajal.springrest.EmployeeManagementSystem.model.Employee;

public class EmployeeService {
	
	private Map<Long,Employee> employees= EmployeeDatabase.getEmployeeDetails();

	public EmployeeService() {
		employees.put(101L, new Employee(101,"kajal", "Java", 20000));
		employees.put(102L, new Employee(102,"akshay", "java", 30000));
		employees.put(103L, new Employee(103,"vaibhavi", "python", 21000));
		employees.put(104L, new Employee(104,"abhay", "salesforce", 25000));
		employees.put(105L, new Employee(105,"vinod", "crime", 40000));
		employees.put(106L, new Employee(106,"sonali", "Java", 15000));
		employees.put(107L, new Employee(107,"zainab", "Java", 20000));

	}
	
	

	// Add employee
	public Employee addEmployee(Employee employee){	
		employee.setId(employees.size() + 1);
		employees.put(employee.getId(), employee);
		return employee;
	}
	
	//serach employee by id
	public Employee getEmployee(long id){	
		Employee obj=null;
		obj=employees.get(id);
		
		return obj;
	}
	
	
	//delete employee
	public Employee removeEmployee(long id) {
		return employees.remove(id);
	}
	
	//get all employee
	public List<Employee> getAllEmployee(){		
		return new ArrayList<Employee>(employees.values());
	}
	
	
	//editing emoployee
	
	
	public Employee update(long id,long salary) {
		
		Employee obj=getEmployee(id);
		obj.setSalary(salary);
		removeEmployee(id);
		employees.put(id, obj);
		return obj;	
		
		
	}
	
	public Employee updateDept(long id,String dept) {
		Employee obj=getEmployee(id);
		obj.setDepartment(dept);
		removeEmployee(id);
		employees.put(id, obj);
		return obj;	
		
	}
	

	
	
	

}

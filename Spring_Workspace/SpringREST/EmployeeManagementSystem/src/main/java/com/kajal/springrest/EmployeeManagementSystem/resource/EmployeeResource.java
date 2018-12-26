package com.kajal.springrest.EmployeeManagementSystem.resource;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.kajal.springrest.EmployeeManagementSystem.model.Employee;
import com.kajal.springrest.EmployeeManagementSystem.service.EmployeeService;

@Path("/empsystem")
public class EmployeeResource {
	
	EmployeeService employeeService=new EmployeeService();
	
	@GET
    @Path("search/{empid}")
    @Produces(MediaType.APPLICATION_JSON)
 	public Employee getEmployee(@PathParam("empid") long empid) {
		System.out.println("Searching....");
		return employeeService.getEmployee(empid);
	}

	
	@DELETE
    @Path("delete/{empid}")
    @Produces(MediaType.APPLICATION_JSON)
 	public Employee removeEmployee(@PathParam("empid") long empid) {
		return employeeService.removeEmployee(empid);
	}
	
	@GET
    @Path("getallemployee")
    @Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getEmployees() {
		return employeeService.getAllEmployee();
	}
	

	@POST
    @Path("add/{empid}/{empname}/{empdept}/{empsalary}")
    @Produces(MediaType.APPLICATION_JSON)
 	public Employee addEmployee(@PathParam("empid") long empid,@PathParam("empname") String empname,@PathParam("empdept") String empdept,@PathParam("empsalary") long empsalary) {
		Employee newEmp=new Employee(empid, empname, empdept, empsalary);
		return employeeService.addEmployee(newEmp);
	}
	
	
	@PUT
	@Path("/updateSalary/{empid}/{newsalary}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee updateSalary(@PathParam("empid") long empid,@PathParam("newsalary") long newsalary) {
		//Employee obj=employeeService.getEmployee(empid);
		//obj.setSalary(newsalary);
		//return obj;
		Employee obj=employeeService.update(empid, newsalary);
		return obj;
		
	}
	
	
	@PUT
	@Path("/updateDept/{empid}/{newdept}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee updateDept(@PathParam("empid") long empid,@PathParam("newdept") String newdept) {
		//Employee obj=employeeService.getEmployee(empid);
		//obj.setSalary(newsalary);
		//return obj;
		Employee obj=employeeService.updateDept(empid, newdept);
		
		return obj;
		
	}
	
	
	

}

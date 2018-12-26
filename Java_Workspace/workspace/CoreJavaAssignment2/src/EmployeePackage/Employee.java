package EmployeePackage;

public abstract class Employee
{
		
	
private static int employeeId;
	
	
	protected double salary;
	protected String employeeName;
	private int empId;
	//static double totalSalary=0;
	
	//init block
	{
		//totalSalary=+totalSalary;
		empId=++employeeId;
	}
	
		
	public Employee()
	{
		employeeName="unknown";
		salary=0;
	}
	
	//parameterized constructor
	public Employee (String employeeName, int salary)
	{
		this.employeeName=employeeName;
		this.salary=salary;
	}
	
	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
		
	
	public int getEmpId()
	{
		return empId;
	}
	
	public String getEmployeeName()
	{
		return employeeName;
	}
	
	public double getSalary() 
	{
		return salary;
	}
	
	public abstract void calculateSalary();
		
}

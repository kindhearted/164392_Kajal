package EmployeePackage;

public class Labour extends Employee 
{
	
	private double overTimeCost;
	private boolean isOvertimeLabour;
	private int noOfHour;
	
	{
		overTimeCost=100;   //per hour
	}
	
	
	public Labour() 
	{
		
		isOvertimeLabour=false;
	}

	public Labour (String employeeName, double salary) 
	{
		this.employeeName=employeeName;
		this.salary=salary;
		isOvertimeLabour=false;

	}
	
	public Labour (String employeeName, double salary,boolean isOvertimeLabour, int noOfHour)
	{
		this.employeeName=employeeName;
		this.salary=salary;
		this.isOvertimeLabour=isOvertimeLabour;
		this.noOfHour=noOfHour;
	}
	
	public void calculateSalary()
	{
		if(isOvertimeLabour==false)
		{
			salary=this.salary;
		}
		else
		{
			salary=((this.salary)+(overTimeCost*noOfHour));

		}
		
	}


	

}

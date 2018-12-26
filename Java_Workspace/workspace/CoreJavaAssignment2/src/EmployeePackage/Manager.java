package EmployeePackage;

public class Manager extends Employee 
{
	private double incentive;

	private boolean isIncentiveAvail;
	
	{
		incentive=250;   //per hour
	}


	public Manager() 
	{
	
		isIncentiveAvail=false;
	}



	public Manager(String employeeName, double salary) 
	{
	this.employeeName=employeeName;
	this.salary=salary;
	isIncentiveAvail=false;

	}

	public Manager(String employeeName, double salary,boolean isIncentiveAvail)
	{
		this.employeeName=employeeName;
		this.salary=salary;
		this.isIncentiveAvail=isIncentiveAvail;
	}

	public void calculateSalary()
	{
		if(isIncentiveAvail==false)
		{
			salary=this.salary;
		}
		else
		{
			salary=((this.salary)+(incentive));

		}
	}
	
}

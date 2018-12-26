package EmployeePackage;

public class TestEmployee {

	public static void testManager()
	{
		Manager manager1=new Manager("Akshay",500);
		manager1.calculateSalary();
		System.out.println(manager1.employeeName+" salary is "+ manager1.salary);		
		
		
		
		Manager manager2=new Manager("Abhay",600,true);
		manager2.calculateSalary();
		System.out.println(manager2.employeeName+" salary is "+ manager2.salary);
		
		
	}
	
	public static void testLabour()
	{
		
		Labour labour1=new Labour("Kajal",900);
		labour1.calculateSalary();
		System.out.println(labour1.employeeName+" salary is "+labour1.salary);
		
		Labour labour2=new Labour("Vaibhavi",1000,true,3);
		labour2.calculateSalary();
		System.out.println(labour2.employeeName+" salary is "+labour2.salary);
		
				
		
	}
	
	
	public static void main(String[] args)
	{
		
		testManager();
		testLabour();
		
	}

}

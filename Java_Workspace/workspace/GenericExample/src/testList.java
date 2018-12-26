
import java.util.*;
 
public class testList {
 
	public static void main(String[] args) {
 
		Employee emp1=new Employee(101, "Kajal");
		Employee emp2=new Employee(12, "Vaibhavi");
		Employee emp3=new Employee(103, "Akshay");
		
		
		List<Employee> listEmp=new ArrayList<>();
		listEmp.add(emp1);
		listEmp.add(emp2);
		listEmp.add(emp3);
	//	listEmp.add(bank1);
		
		
		
		BankAccount bank1=new BankAccount(102, "Abhay");
		BankAccount bank2=new BankAccount(103, "Vinod");
		BankAccount bank3=new BankAccount(1024, "Sonali");
		
		List<BankAccount> listBank=new ArrayList<>();
		listBank.add(bank1);
		listBank.add(bank2);
		listBank.add(bank3);
		
	
		
		
	}
 
}
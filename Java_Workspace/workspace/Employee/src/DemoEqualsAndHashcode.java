import java.util.*;

import javax.print.attribute.HashAttributeSet;

public class DemoEqualsAndHashcode {
	
	public static void main(String[] args) {
		
	
	Hashtable<Employee,Integer> map=new Hashtable<Employee,Integer>();
	
	
	Employee emp1=new Employee("Kajal",101);
	map.put(emp1,1);
	Employee emp2=new Employee("Vaibhavi",102);
	map.put(emp2,2);
	Employee emp3=new Employee("Kajal", 101);
	map.put(emp3,3);
	
	System.out.println(emp1.equals(emp2));
	System.out.println(emp1.equals(emp3));
	
	System.out.println(emp1.hashCode());
	System.out.println(emp2.hashCode());
	System.out.println(emp3.hashCode());
	
}
}
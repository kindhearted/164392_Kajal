import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreesetExample implements Comparator<Person> {
	public static void main(String[] args) {
		TreeSet<Person> personset=new TreeSet<>(new TreesetExample());
		
		
		//creating person objects
		Person person1=new Person("Kajal", 49, 5.6);
		Person person2=new Person("Akshay", 68, 5.8);
		Person person3=new Person("Vaibhavi", 49, 5.6);
		Person person4=new Person("Abhay", 52, 5.4);
		Person person5=new Person("Sonali", 52, 5.4);
		Person person6=new Person("Vinod", 60, 5.9);
		

		
				
		//Adding persons to treeset
		personset.add(person1);
		personset.add(person2);
		personset.add(person3);
		personset.add(person4);
		personset.add(person5);
		personset.add(person6);
				
		//Traversing TreeSet  
	    for(Person person:personset){  
	    System.out.println(person.name+" is having weight "+person.weight+" and height "+person.height);  
	    }  
		
	}

	@Override
	public int compare(Person o1, Person o2) {
		if(o1.weight>o2.weight){  
	        return 1;  
	    }else if(o1.weight<o2.weight){  
	        return -1;  
	    }else{  
	    	if(o1.height>o2.height) {
	    		return 1;	    		
	    	}
	    	else {
	    		return -1;
	    	}
	    }    	
}
	
}

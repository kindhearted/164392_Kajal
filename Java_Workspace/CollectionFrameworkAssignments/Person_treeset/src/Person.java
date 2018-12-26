
public class Person implements Comparable<Person>
{
	double height;
	float weight;
	String name;
	
	public Person(String name,float weight,double height) {
		this.name=name;
		this.weight=weight;
		this.height=height;
	}

	@Override
	public int compareTo(Person person) {
		if(weight>person.weight){  
	        return 1;  
	    }else if(weight<person.weight){  
	        return -1;  
	    }else{  
	    	if(height>person.height) {
	    		return 1;	    		
	    	}
	    	else {
	    		return -1;
	    	}
	    	
	    }  
	}

}

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exersice1SolutionJava7 {
	public static void main(String[] args) {
		List<Person> people=Arrays.asList(
				new Person("Kajal","Kurhade",21),
				new Person("Akshay","Nalabe",23),
				new Person("Vaibhavi", "Sawant", 22),
				new Person("Simba", "Cat", 2)

				
				);
		
		
		//sort list by last name

		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		//create a method thet print all element in list
		
		printAll(people);
		
		
		
		//create a method to print all names and last anme begin with C
		
		System.out.println("\n\nGoing to print the names strat with C:");
		printLastNameConditionally(people,new Condition() {

			@Override
			public boolean test(Person p) {
				
				return p.getLastName().startsWith("C");

			}
			
		});

		printLastNameConditionally(people,new Condition() {

			@Override
			public boolean test(Person p) {
				
				return p.getLastName().startsWith("K");

			}
			
		});

		

	}

	private static void printLastNameConditionally(List<Person> people,Condition condition) {
		for(Person p:people)
		{
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
	}

	 

	
	private static void printAll(List<Person> people) {
			for(Person p:people)
				System.out.println(p);
	}

	
	
}

interface Condition{
	boolean test(Person p);
}

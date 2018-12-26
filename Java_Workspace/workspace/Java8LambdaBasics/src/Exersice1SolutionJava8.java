import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Exersice1SolutionJava8 {
	public static void main(String[] args) {
		List<Person> people=Arrays.asList(
				new Person("Kajal","Kurhade",21),
				new Person("Akshay","Nalabe",23),
				new Person("Vaibhavi", "Sawant", 22),
				new Person("Simba", "Cat", 2)

				
				);
		
		
		//sort list by last name

		Collections.sort(people, (p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
		
		//create a method then print all element in list
		
		printLastNameConditionally(people,p->true,p->System.out.println(p));
		
		
		
		//create a method to print all names and last name begin with C
		
		System.out.println("\n\nGoing to print the names strat with C:");
		printLastNameConditionally(people,p->p.getLastName().startsWith("C"),p->System.out.println(p.getLastName()));

		
		System.out.println("\n\nGoing to print the names strat with K:");
		printLastNameConditionally(people,p->p.getLastName().startsWith("K"),p->System.out.println(p.getFirstName()));

		

	}

	private static void printLastNameConditionally(List<Person> people,Condition condition,Consumer<Person> consumer) {
		for(Person p:people)
		{
			if(condition.test(p)) {
				consumer.accept(p);
			}
		}
	}

	 

	
	

	
	
}



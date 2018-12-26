package replaceWithUpperCase;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReplaceFirstLetterWithUpper {

	public static void main(String[] args) {
		List<String> stringList=new ArrayList<>();
		stringList.add("Kajal");
		stringList.add("Akshay");
		stringList.add("Abhay");
		stringList.add("Vaibhavi");
		stringList.add("Sonali");
		stringList.add("vinod");
		
		stringList.stream()
				.forEach(o->System.out.println(o.replaceAll(o, o.toUpperCase())));
		
		
		System.out.println(stringList);
	}
	

}

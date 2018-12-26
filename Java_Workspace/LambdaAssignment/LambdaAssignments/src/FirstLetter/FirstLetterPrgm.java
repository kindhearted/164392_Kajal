package FirstLetter;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FirstLetterPrgm {

	public static void main(String[] args) {
		List<String> stringList=new ArrayList<>();
		stringList.add("Kajal");
		stringList.add("Akshay");
		stringList.add("Abhay");
		stringList.add("Vaibhavi");
		stringList.add("Sonali");
		stringList.add("vinod");
		
		stringList.stream()
			.forEach(o->System.out.println(o.charAt(0)));
		System.out.println(stringList);
	}
	

}

package OddLengthRemove;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RemoveOddLengthStringUsingStream {

	public static void main(String[] args) {
		List<String> stringList=new ArrayList<>();
		stringList.add("Kajal");
		stringList.add("Akshay");
		stringList.add("Abhay");
		stringList.add("Vaibhavi");
		stringList.add("Sonali");
		stringList.add("vinod");
		
		List<String> stringStream=stringList.stream()
				.filter(s->s.length()%2==0)
				.collect(Collectors.toList());
		
		System.out.println(stringStream);
		
	}
	

}

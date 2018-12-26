import java.util.*;
import java.util.stream.*;

public class TestQuestionsOnFruit {

	public static void main(String[] args) {
		
		Fruit fruit1=new Fruit("Apple", 100, 120, "Red");
		Fruit fruit2=new Fruit("Banana", 60, 85, "Yellow");
		Fruit fruit3=new Fruit("Srawberry", 160, 50, "Red");
		Fruit fruit4=new Fruit("Grapes", 100, 120, "Green");
		Fruit fruit5=new Fruit("Mango", 100, 120, "Yellow");
		Fruit fruit6=new Fruit("Orange", 190, 90, "Orange");
		Fruit fruit7=new Fruit("WaterMelon", 200, 75, "Green");
		Fruit fruit8=new Fruit("Lichi", 50, 61, "White");
				
		List<Fruit> fruitSet=new ArrayList<Fruit>();
		fruitSet.add(fruit1);
		fruitSet.add(fruit2);
		fruitSet.add(fruit3);
		fruitSet.add(fruit4);
		fruitSet.add(fruit5);
		fruitSet.add(fruit6);
		fruitSet.add(fruit7);
		fruitSet.add(fruit8);
		
		
		
		
		
		System.out.println("===================================================");
		List<Fruit> question1=fruitSet.stream()
				.filter(f->f.getCalorie()<100)
				.sorted(Comparator.comparing(Fruit::getCalorie).reversed())
				.collect(Collectors.toList());
		System.out.println(question1);
	
		
		System.out.println("===================================================");

		List<Fruit> question2=fruitSet.stream()
				.sorted(Comparator.comparing(Fruit::getColor))
				.collect(Collectors.toList());			    
		
		System.out.println(question2);

	
		System.out.println("===================================================");
		
		
		List<Fruit> question3=fruitSet.stream()
				.filter(f->f.getColor()=="Red")
				.sorted(Comparator.comparing(Fruit::getPrice).reversed())
				.collect(Collectors.toList());
				
			   
			   		
		System.out.println(question3);

		
		System.out.println("===================================================");
	}

	

}

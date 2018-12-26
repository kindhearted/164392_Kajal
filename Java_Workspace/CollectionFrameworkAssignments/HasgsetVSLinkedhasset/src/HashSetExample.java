import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
			HashSet<Integer> hashsetexample=new HashSet<Integer>();
			
			//adding elements in hashset
			hashsetexample.add(10);  
			hashsetexample.add(9);  
			hashsetexample.add(8);  
			hashsetexample.add(7);  
			hashsetexample.add(6);  
			hashsetexample.add(5);  
			hashsetexample.add(4);  
			hashsetexample.add(3);  
			hashsetexample.add(0);  
			hashsetexample.add(30);  


			
			System.out.println("Elements of HashSet:\n");

			//Traversing elements  
			Iterator<Integer> iterator=hashsetexample.iterator();  
			while(iterator.hasNext()){  
			   System.out.println(iterator.next());  
			  }  
			
			
			LinkedHashSet<Integer> linkedhashsetexample=new LinkedHashSet<Integer>();
			
			//adding elements in hashset
			linkedhashsetexample.add(100);  
			linkedhashsetexample.add(90);  
			linkedhashsetexample.add(80);  
			linkedhashsetexample.add(70);  
			linkedhashsetexample.add(60);  
			linkedhashsetexample.add(50);  
			linkedhashsetexample.add(40);  
			linkedhashsetexample.add(30);  
			linkedhashsetexample.add(10);  
			linkedhashsetexample.add(300);  
			linkedhashsetexample.add(1000);  

			System.out.println("\n\nElements of LinkedHashSet:\n");

			//Traversing elements  
			Iterator<Integer> iterator2=linkedhashsetexample.iterator();  
			while(iterator2.hasNext()){  
			   System.out.println(iterator2.next());  
			  }  
	}

}

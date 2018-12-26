package ThreadProgram;

import java.util.ArrayList;
import java.util.List;

public class RunThread {
	public static void main(String[] args) {
		List<Integer> numberList=new ArrayList<>();
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		numberList.add(5);
		numberList.add(6);
		numberList.add(7);
		numberList.add(8);
		numberList.add(9);
		numberList.add(10);
		
		Thread myThread=new Thread(()->System.out.println(numberList));
		myThread.run();
		
		
	}

}

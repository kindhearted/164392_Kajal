import java.util.Scanner;
public class SearchingElement {

	public static void main(String[] args)
	{
		int[] Array = new int[15];
		int index;
		Scanner scanner1=new Scanner(System.in);
		System.out.println("Enter 15 Array values:");
		
		for(index=0;index<15;index++)
		{
			Array[index]=scanner1.nextInt();
		}
		
		for(index=0;index<15;index++)
		{
			System.out.println(Array[index]);
		}
		
		
	}
}

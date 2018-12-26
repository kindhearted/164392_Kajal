

import java.util.Scanner;
public class SumOfNumbers {


	public static void main(String[] args)
	{
		int index=1,start,end,sum=0;
		Scanner strt=new Scanner(System.in);
		Scanner finish=new Scanner(System.in);

		System.out.println("Going to print sum Numbers");
		
		System.out.println("Enter number to start");
		start=strt.nextInt();
		
		System.out.println("Enter number to end");
		end=finish.nextInt();
		
		for(index=start;index<=end;index++)
		{
			sum=sum+index;
			
			
		}
		System.out.println(sum);

	}

}

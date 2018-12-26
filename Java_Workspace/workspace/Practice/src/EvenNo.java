import java.util.Scanner;

public class EvenNo {

	public static void main(String[] args)
	{
		int index=1,start,end;
		Scanner strt=new Scanner(System.in);
		Scanner finish=new Scanner(System.in);

		System.out.println("Going to print Even Numbers");
		
		System.out.println("Enter number to start");
		start=strt.nextInt();
		
		System.out.println("Enter number to end");
		end=finish.nextInt();
		
		for(index=start;index<=end;index++)
		{
			if(index%2==0)
			{
				System.out.println(index);
			}
		}
		

	}

}

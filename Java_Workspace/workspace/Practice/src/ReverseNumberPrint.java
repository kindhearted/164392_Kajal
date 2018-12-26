import java.util.Scanner;

public class ReverseNumberPrint
{
	public static void main(String[] args)
	{
		int index=1,start,end;
		Scanner strt=new Scanner(System.in);
		Scanner finish=new Scanner(System.in);

		System.out.println("Going to print reverse order Numbers");
		
		System.out.println("Enter number to end");
		start=strt.nextInt();
		
		System.out.println("Enter number to start");
		end=finish.nextInt();
		
		for(index=end;index>=start;index--)
		{
			System.out.println(index);			
			
		}

	}
}

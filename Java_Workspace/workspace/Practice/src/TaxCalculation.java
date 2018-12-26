import java.util.Scanner;

public class TaxCalculation
{

	public static void main(String[] args)
	{

		System.out.println("Enter CTC:");
		Scanner scanner1=new Scanner(System.in);
		int ctc=scanner1.nextInt();
		double tax;
		if(ctc>=0 && ctc<=180000)
		{
			System.out.println("Tax Amount: NIL");
		}
		else if(ctc>=181001 && ctc<=300000)
		{
			tax=ctc*0.10;
			System.out.println("Tax Amount: "+tax);
		}
		else if(ctc>=300001 && ctc<=500000)
		{
			tax=ctc*0.20;
			System.out.println("Tax Amount: "+tax);
		}
		else
		{
			tax=ctc*0.30;
			System.out.println("Tax Amount: "+tax);
		}
		
	}

}

import java.util.Scanner;

public class Interest
{
	
	public static void main(String[] args)
	{
		int principalAmpont,rate=10,time=1,compoundingFrequency=4;
		System.out.println("Enter amount");
		Scanner scanner1=new Scanner(System.in);
		principalAmpont=scanner1.nextInt();	
		
		int simpleInterest=principalAmpont*rate*time;
		
		System.out.println("Simple Interest: "+simpleInterest);
		double power=Math.pow(1+(rate/compoundingFrequency),(compoundingFrequency*time));
		double compoundInterest=principalAmpont*power;
		
		System.out.println("Compound Interest: "+ compoundInterest);
		
	}

}

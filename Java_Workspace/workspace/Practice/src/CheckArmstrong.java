import java.util.*;
import java.io.*;
import java.math.*;

public class CheckArmstrong {

	public static void main(String[] args) {
		int temp,sum=0,remainder,count=0;
		System.out.println("Eneter number:");
		
		Scanner in=new Scanner(System.in);
		
		int num=in.nextInt();
		
		temp=num;
		
		while(temp!=0)
		{
			count++;
			temp=temp/10;
			
		
		}
		temp=num;
		while(temp!=0)
		{
			remainder=temp%10;
			sum+=Math.pow(remainder,count);
			temp=temp/10;	
			
		}
		
		if(num==sum)
		{
			System.out.println("Number is Armstrong number");
		}
		else
		{
			System.out.println("Number is not Armstrong number");

		}
	}

	
	

}

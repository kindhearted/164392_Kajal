public class CheckArmstrongBetween 
{
	public static void main(String[] args)
	{
		int temp,remainder,num=100;
		while(num<1000)
		{
			int sum=0;
			temp=num;
			while(temp!=0)
			{
				remainder=temp%10;
				temp=temp/10;	
				sum+=Math.pow(remainder,3);
			}
			if(num==sum)
			{
				System.out.println("Number is Armstrong number "+num);
			}
			num++;
		
		}
	}
}


import java.util.Scanner;

public class ResultDeclareation 
{

	public static void main(String[] args)
	{
		System.out.println("Enter marks of Subject 1:");
		Scanner scanner1=new Scanner(System.in);
		int subject1=scanner1.nextInt();
		
		System.out.println("Enter marks of Subject 2:");
		Scanner scanner2=new Scanner(System.in);
		int subject2=scanner2.nextInt();
		
		System.out.println("Enter marks of Subject 3:");
		Scanner scanner3=new Scanner(System.in);
		int subject3=scanner3.nextInt();
		
		
		if(subject1>=60 && subject2>=60 && subject3>=60)
		{
			System.out.println("Status Pass....");
		}
		else if((subject1>=60 && subject2>=60 && subject3<=60) || (subject1>=60 && subject2<=60 && subject3>=60) || (subject1<=60 && subject2>=60 && subject3>=60))
		{
			System.out.println("Status Promoted....");
		}
		else
		{
			System.out.println("Status Failed....");
		}
	}

}

import java.util.Scanner;

public class Login
{

	public static void main(String[] args)
	{
		String fixUser="kajal";
		String fixPassword="kajal@123";
				
		int count=0;
		do{
			
			
			System.out.println("Enter UserId:");
			Scanner scanner1=new Scanner(System.in);
			String userId=scanner1.next();
			
			System.out.println("Enter Password:");
			Scanner scanner2=new Scanner(System.in);
			String password=scanner2.next();
			
			if((fixUser.equals(userId)) && (fixPassword.equals(password)))
			{
				System.out.println("Welcome "+userId);
			}
			else
			{
				System.out.println("Wrong...");
			}
			
			if(count==2)
			{
				System.out.println("Contact Admin....");
			}
			count++;
		}while(count<3);
	}

}

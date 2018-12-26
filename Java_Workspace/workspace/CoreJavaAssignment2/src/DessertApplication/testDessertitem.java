package DessertApplication;

import java.util.Scanner;

public class testDessertitem {

	public static void main(String[] args)
	{
		String stringForItem;
		int rateForItem;
		int choice1;
		Scanner scanner1=new Scanner(System.in);
		Scanner scanner2=new Scanner(System.in);
		System.out.println("Enter your role:\n1.Owner\n2.Customer\n3.Exit\n======================================");
		choice1=scanner1.nextInt();
		switch(choice1)
		{
		case 1 : 
			System.out.println("Enter data to add new dessert Item:");
			stringForItem=scanner1.next();
			System.out.println("Enter Rate:");
			rateForItem=scanner2.nextInt();
			break;
			
			
		case 2 :
			System.out.println("select what you want to buy:\n1.Candy\n2.Cookie\n3.IceCream\n4.Exit\n=======================");
			choice1=scanner1.nextInt();
			switch(choice1)
			{
			 	case 1:
			 		
			 		break;
			 	case 2:
			 		
			 		break;
			 	case 3:
			 		
			 		break;
			 	case 4:
			 		
					System.exit(0);
			 	default:
			 		System.out.println("Invalid Choice");
			}
			
			break;
			
			
		case 3 :
				System.exit(0);
			
		default :
			System.out.println("Invalid choice!!!");
		}
		

	}

}

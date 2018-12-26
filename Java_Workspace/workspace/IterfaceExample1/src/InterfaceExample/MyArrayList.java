package InterfaceExample;

import java.util.Scanner;

public class MyArrayList implements MyList 
{
	int index=0,total=0,searchElement,updateValue;
    int array[]=new int[100];
    Scanner scanner1=new Scanner(System.in);
	

	@Override
	public int add()
	{
		System.out.println("How many element want to insert:");
		total=scanner1.nextInt();
		System.out.println("Enter  array elements:");
        for(index=0;index<total;index++)
           {
           array[index]=scanner1.nextInt();
           }
		
        return array[index];
	}

	@Override
	public int get()
	{
		 System.out.println("Enter number of elements");  
		    total = scanner1.nextInt();   
		    array = new int[total];  
		   
		    System.out.println("Enter those " + total + " elements");  
		   
		    for (index = 0; index < total; index++)  
		      array[index] = scanner1.nextInt();  
		   
		    System.out.println("Enter value to find");  
		    searchElement = scanner1.nextInt();  
		   
		    for (index = 0; index < total; index++)  
		    {  
		      if (array[index] == searchElement)     /* Searching element is present */  
		      {  
		         System.out.println(searchElement + " is present at location " + (index + 1) + ".");  
		          break;  
		      }  
		   }  
		   if (index == total)  /* Element to search isn't present */  
		      System.out.println(searchElement + " isn't present in array.");  
		   
		return index;
	}

	@Override
	public int getAll() 
	{
		 System.out.println("your array Elements are:");
         for(index=0;index<10;index++)
         {
         System.out.println(array[index]);
         }
		return 0;
	}

	@Override
	public int update() 
	{
		System.out.println("Enter number of elements");  
	    total = scanner1.nextInt();   
	    array = new int[total];  
	   
	    System.out.println("Enter those " + total + " elements");  
	   
	    for (index = 0; index < total; index++)  
	      array[index] = scanner1.nextInt();  
	   
	    System.out.println("Enter value to replace");  
	    searchElement = scanner1.nextInt();  
	    System.out.println("Enter value to update:");
	    updateValue=scanner1.nextInt();
	    
	   
	    for (index = 0; index < total; index++)  
	    {  
	      if (array[index] == searchElement)     /* Searching element is present */  
	      {  
	    	  array[index]=updateValue;
	    	  break;  
	      }  
	   }  
	  
		return 0;
	}

	@Override
	public int remove()
	{
		
		return index;
		
	}

}

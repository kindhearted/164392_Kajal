import java.util.Scanner;  
   
class TryArrayOperation   
{  
  public static void main(String args[])  
  {  
    int index, total, search, array[];  
   
    Scanner scanner = new Scanner(System.in);  
    System.out.println("Enter number of elements");  
    total = scanner.nextInt();   
    array = new int[total];  
   
    System.out.println("Enter those " + total + " elements");  
   
    for (index = 0; index < total; index++)  
      array[index] = scanner.nextInt();  
   
    System.out.println("Enter value to find");  
    search = scanner.nextInt();  
   
    for (index = 0; index < total; index++)  
    {  
      if (array[index] == search)     /* Searching element is present */  
      {  
         System.out.println(search + " is present at location " + (index + 1) + ".");  
          break;  
      }  
   }  
   if (index == total)  /* Element to search isn't present */  
      System.out.println(search + " isn't present in array.");  
  }  
}
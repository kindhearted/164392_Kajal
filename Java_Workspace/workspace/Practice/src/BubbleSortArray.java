import java.util.Scanner;

public class BubbleSortArray {
	
	static void bubbleSort(int[] array) {  
        int total = array.length;  
        int tempVar = 0;  
         for(int index=0; index < total; index++){  
                 for(int innerIndex=1; innerIndex < (total-index);innerIndex++){  
                          if(array[innerIndex-1] > array[innerIndex]){  
                                 //swap elements  
                        	  tempVar = array[innerIndex-1];  
                                 array[innerIndex-1] = array[innerIndex];  
                                 array[innerIndex] = tempVar;  
                         }  
                          
                 }  
         }  
  
    } 

	public static void main(String[] args)
	{
		    Scanner scanner = new Scanner(System.in);  
		    System.out.println("Enter number of elements");  
		   int total = scanner.nextInt();   
		    int[] array = new int[total];  
		    
		    System.out.println("Enter those " + total + " elements");  
		    
		    for (int index = 0; index < total; index++)  
		      array[index] = scanner.nextInt();  
		    
		    
		    bubbleSort(array);
		    
		    System.out.println("Array After Bubble Sort");  
            for(int index=0; index < array.length; index++)
            {  
                    System.out.print(array[index] + " ");  
            }
	}
}
	
	


import java.util.Scanner;

public class ArrayOperations
{
	
	public
	        int array[]=new int[10];
	        int index,innerindex,tempVar,max;
	        Scanner scanner1=new Scanner(System.in);
	          
	        int  getElementsOfArray()
	        {
	            
	         System.out.println("Enter 10 array elements:");
	        
	         for(index=0;index<10;index++)
	            {
	            array[index]=scanner1.nextInt();
	            }
			
	         return array[index];
	        }
	        
	        
	        int sortArrayAsc()
	        {
	        	 System.out.println("Enter 10 array elements:");
	 	        
		         for(index=0;index<10;index++)
		            {
		            array[index]=scanner1.nextInt();
		            }
				
	        	
	             for(index=0;index<10;index++)
	                 {
	                     for(innerindex=index+1;innerindex<index-1;innerindex++)
	                        {
	                             if(array[index]>array[innerindex])
	                             {
	                                 tempVar=array[index];
	                                 array[index]=array[innerindex];
	                                 array[innerindex]=tempVar;
	                             }
	                         }
	                 }
	             System.out.println("Array sorted in Ascending order:");
				return array[index];
				
	             
	          
	        }
	        
	        
	        int sortArrayDesc()
	        {
	        	 System.out.println("Enter 10 array elements:");
	 	        
		         for(index=0;index<10;index++)
		            {
		            array[index]=scanner1.nextInt();
		            }
				
	             for(index=0;index<10;index++)
	                 {
	                     for(innerindex=index+1;innerindex<index-1;innerindex++)
	                        {
	                             if(array[index]<array[innerindex])
	                             {
	                                 tempVar=array[index];
	                                 array[index]=array[innerindex];
	                                 array[innerindex]=tempVar;
	                             }
	                         }
	                 }
	             System.out.println("Array sorted in Descending order:");
	             return array[index];
	          
	        }
	        
	        
	        
	        void showArray()
	        {
	        	 System.out.println("your array Elements are:");
	             for(index=0;index<10;index++)
	             {
	             System.out.println(array[index]);
	             }
	            
	        }
	        
	        int largestElement() 
	        { 
	        	 System.out.println("Enter 10 array elements:");
	 	        
		         for(index=0;index<10;index++)
		            {
		            array[index]=scanner1.nextInt();
		            }
				  
	         
	            max = array[0]; 
	           
	            
	            for (index = 1; index < array.length; index++) 
	                if (array[index] > max) 
	                    max = array[index]; 
	           
	            return max; 
	        } 
	              
   

}

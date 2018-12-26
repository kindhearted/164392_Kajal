
public class MySingleTone{
	
	
	 private static MySingleTone single_instance=null; 
	  
	 String str;
	 private MySingleTone() 
	 {
		 	 str = "Hello!!!!";
	 }
	  	    // static method to create instance of Singleton class 
	    private static MySingleTone getSingleton() 
	    { 
	        // To ensure only one instance is created 
	        if (single_instance == null) 
	        { 
	            System.out.println("creating single tone");

	            single_instance = new MySingleTone(); 
	        } 
	        return single_instance; 
	    } 
	    
	    
	    public static void main(String[] args)
	    {
	    	
			MySingleTone object1=MySingleTone.getSingleton();
			System.out.println(object1.hashCode());
			System.out.println("string ="+object1.str);
			
			MySingleTone object2=MySingleTone.getSingleton();
			System.out.println(object2.hashCode());
			System.out.println("string ="+object2.str);

		}
}

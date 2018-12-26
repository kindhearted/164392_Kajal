package BsicArithOperation;

public class BasicOperations {

	public static void main(String[] args) {
		functionsInterface add=(a,b)->a+b;
		functionsInterface sub=(a,b)->a-b;
		functionsInterface div=(a,b)->a/b;
		functionsInterface mul=(a,b)->a*b;
		
		
		BasicOperations basic=new BasicOperations();
		System.out.println("Addition of 9 & 3 is:"+add.operation(9, 3));
		System.out.println("Substraction 9 & 3  is:"+basic.operate(9, 3, sub));
		System.out.println("Multiplication of 9 & 3 is:"+basic.operate(9, 3, mul));
		System.out.println("Division of 9 & 3 is:"+basic.operate(9, 3, div));
	}
	
	 private static int operate(int a, int b, functionsInterface funcobj) 
	    { 
	        return funcobj.operation(a, b); 
	    } 
	

}

interface functionsInterface{
	public int operation(int a,int b);
}
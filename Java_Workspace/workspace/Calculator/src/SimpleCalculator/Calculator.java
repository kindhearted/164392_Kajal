package SimpleCalculator;

public class Calculator
{

	
	int number1,number2;
	
	
	public int addition(int number1,int number2)
	{
		return number1+number2;
		
	}
	
	public int substraction(int number1,int number2)
	{
		return number1-number2;
		
	}
	
	public int multiplication(int number1,int number2)
	{
		return number1*number2;
		
	}
	
	public int division(int number1,int number2)
	{
		return number1/number2;
		
	}
	
	public static void main(String[] args) {
		Calculator cal1=new Calculator();
	}
}

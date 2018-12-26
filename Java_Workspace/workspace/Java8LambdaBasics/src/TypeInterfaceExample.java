
public class TypeInterfaceExample {

	public static void main(String[] args) {
		StringLengthLambda myLambda=(String s)-> s.length();
		
		System.out.println(myLambda.getLength("KajalKurhade"));
		printLambda(s->s.length());
	}

	public static void printLambda(StringLengthLambda l)
	{
		System.out.println(l.getLength("Akshay Nalabe"));
		
	}
	
	interface StringLengthLambda{
		int getLength(String s);
	}
}

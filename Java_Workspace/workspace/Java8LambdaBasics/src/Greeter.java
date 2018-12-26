import javax.swing.plaf.synth.SynthSpinnerUI;

public class Greeter  {
	public void greet(Greeting greeting)	{
		greeting.perform();
		}

	public static void main(String[] args) {
		Greeter greeter=new Greeter();
		Greeting helloWorldGreeting=new HelloWorldGreeting();
		Greeting lambdaGreeting=()->System.out.println("Lambda Hello World!!!");
		
		Greeting innerClass=new Greeting() {
			public void perform() {
				System.out.println("InnerClass Hello World!");
			}
		};
		
		//greeter.greet(helloWorldGreeting);
		greeter.greet(lambdaGreeting);
	//	greeter.greet(innerClass);
		
		
		//helloWorldGreeting.perform();
		lambdaGreeting.perform();
	//	innerClass.perform();
		
		
		//greeter.greet(helloWorldGreeting);
		
		
		// MyLambda myLambdaFunction=() -> System.out.println("Hello World!!!");
	}
}


interface MyLambda{
	void foo();
}
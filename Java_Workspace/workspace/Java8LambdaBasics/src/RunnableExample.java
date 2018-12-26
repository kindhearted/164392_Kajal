
public class RunnableExample {

	public static void main(String[] args) {
			Thread myThread=new Thread(new Runnable() {
				
				@Override
				public void run() {
						System.out.println("Inside run of runnable");
				}
			});
			
			myThread.run();
			
			Thread myThread2=new Thread(()->System.out.println("Inside Lambda Function"));
			myThread2.run();
	}

}

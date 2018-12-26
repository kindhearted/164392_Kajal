import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class TestQuestionsOnNews {

	public static void main(String[] args) {

		List<News> listNews=Arrays.asList(
				new News(101, "Kajal", "Akshay", "Why the budget of share market is decreasing rapidly??"),
				new News(101, "Kajal", "Abhay", "Due to lots of investment"),
				new News(101, "Kajal", "Vaibhavi", "I havealready invested 1000000 rs"),
				new News(101, "Kajal", "Sonali", "I invested 5000 but the budget is getting decrease so I'm so worried!! "),
				new News(101, "Kajal", "Akshay", "Can Anyone will reply me please??"),
				new News(101, "Kajal", "Vinod", "Relax everyone..It is share market it will increase or it will decrease we cant give specific eason for thet!!!"),
				new News(101, "Kajal", "Abhay", "We have to wait till budget get upto the mark..."),
				
				new News(102, "Akshay", "Kajal", "Finally they get married!!"),
				new News(102, "Akshay", "Abhay", "I like that couple.."),
				new News(102, "Akshay", "Vaibhavi", "Where they are going to arrange there receiption party??"),
				new News(102, "Akshay", "Vinit", "Bangalore"),
				
				new News(103, "Vaibhavi", "Akshay", "Abfsuvg"),
				new News(103, "Vaibhavi", "Kajal", "budget kigf"),
				new News(103, "Vaibhavi", "Abhay", "jghiuj "),
				new News(103, "Vaibhavi", "Vinit", "hbifuymb"),
				
				new News(104, "Abhay", "Akshay", "jhbfjb budget chvfuigb"),
				new News(104, "Abhay", "Abhay", "gfngn"),
				new News(104, "Abhay", "vaibhavi", "nfgmghm"),
				new News(104, "Abhay", "Sonali", "fmmgvn budget dfhugigf ghtrh"),
				new News(104, "Abhay", "Vinod", "dfjvbngj")								
				);
		
				
				//4.List<Integer> countList=listNews.stream()
				Map<Object, Long> question4 = listNews.stream()
						.collect(Collectors.groupingBy(o -> o.getNewsId(),Collectors.counting()));
				System.out.println(question4);
				long max=0;
				int key=0;
				for(Entry<Object, Long> entry:question4.entrySet())
				{
					if(entry.getValue()>max)
					{
						max=entry.getValue();
						key= (int) entry.getKey();
					}
				}
				System.out.println("NewsId And Total Comments:\n"+question4); 			
				System.out.println("NewsId "+key+" got max comments that is : "+max);
				System.out.println("================================================================================================");
					

				
				//5.count of budget...
				Long question5=listNews.stream()
						.filter(e->e.getComment().contains("budget")).count();
				System.out.println("Occurence of Word Budget is :"+question5);
				System.out.println("================================================================================================");

				
				
				
				//6.max number of comments by user
				Map<Object, Long> question6 = listNews.stream()
						.collect(Collectors.groupingBy(e -> e.getCommentByUser(),Collectors.counting()));
						System.out.println("Comment by user and no. of comments:\n"+question6);
						long maxNumber=0;
						Object keyValue=0;
						for(Entry<Object, Long> entry:question6.entrySet())
						{							
							if(entry.getValue()>maxNumber)
							{
								maxNumber=entry.getValue();
								keyValue= entry.getKey();
							}
						}
						System.out.println("User "+keyValue+" got max number of comments that is : "+maxNumber);
						System.out.println("================================================================================================");

						
						
				//7.comments by user wise number of comments	
				Map<Object, Long> question7 = listNews.stream()
						.collect(Collectors.groupingBy(e -> e.getCommentByUser(),Collectors.counting()));
					System.out.println("Comment by user and no. of comments:\n"+question7);
					System.out.println("================================================================================================");
	
				

		
		
	}

}

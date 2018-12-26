import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestTransaction {

	
	public static void main(String[] args) {

		Trader trader1=new Trader("Kajal", "Mumbai");
		Trader trader2=new Trader("Akshay", "Baramati");
		Trader trader3=new Trader("Vaibhavi", "Pune");
		Trader trader4=new Trader("Vinod", "Delhi");
		Trader trader5=new Trader("Vinit", "Indore");
		Trader trader6=new Trader("Kaustubh", "Mumbai");
		Trader trader7=new Trader("Rohit", "Pune");
		Trader trader8=new Trader("Pranita", "Pune");
		Trader trader9=new Trader("Zainab", "Chennai");
		Trader trader10=new Trader("Rutuja", "Indore");
		
		List<Trader> traderList=new ArrayList();
		traderList.add(trader1);
		traderList.add(trader2);
		traderList.add(trader3);
		traderList.add(trader4);
		traderList.add(trader5);
		traderList.add(trader6);
		traderList.add(trader7);
		traderList.add(trader8);
		traderList.add(trader9);
		traderList.add(trader10);
		
		
		
		
		Transaction transactio1=new Transaction(trader1, 2011, 10000);
		Transaction transactio2=new Transaction(trader2, 2010, 13000);
		Transaction transactio3=new Transaction(trader3, 2011, 19000);
		Transaction transactio4=new Transaction(trader4, 2008, 20000);
		Transaction transactio5=new Transaction(trader5, 2009, 16000);
		Transaction transactio6=new Transaction(trader6, 2010, 11000);
		Transaction transactio7=new Transaction(trader7, 2012, 90000);
		Transaction transactio8=new Transaction(trader8, 2015, 13000);
		Transaction transactio9=new Transaction(trader9, 2000, 25000);
		Transaction transactio10=new Transaction(trader10, 2011, 50000);
				
		List<Transaction> transactionList=new ArrayList();
		transactionList.add(transactio1);
		transactionList.add(transactio2);
		transactionList.add(transactio3);
		transactionList.add(transactio4);
		transactionList.add(transactio5);
		transactionList.add(transactio6);
		transactionList.add(transactio7);
		transactionList.add(transactio8);
		transactionList.add(transactio9);
		transactionList.add(transactio10);
		
		//8.transaction in 2011 sort ascending
		List<Transaction> question8=transactionList.stream()
				.filter(t->t.getYear()==2011)
				.sorted(Comparator.comparing(Transaction::getValue))
				.collect(Collectors.toList());
		System.out.println("Transactions in 2011 in ascending order:\n"+question8);
		System.out.println("================================================================================================");

		//9.unique cities where trader work	
		System.out.println("Distinct cities from trader-\n");
		System.out.println( transactionList.stream()
                .map(p -> p.trader.getCity()).distinct()
                .collect( Collectors.toList()));
		System.out.println("================================================================================================");

		
		//10.trader from pune and sort themby name
		System.out.println("Traders from Pune --\n");
		System.out.println( traderList.stream()
		                .filter(p -> p.getCity()=="Pune")
		                .sorted(Comparator.comparing(Trader::getName))
		                .collect( Collectors.toList()));
		System.out.println("================================================================================================");

		//11.trader names sorted alphabetically
		System.out.println( traderList.stream()
                .sorted(Comparator.comparing(Trader::getName))
                .collect( Collectors.toList()));
		System.out.println("================================================================================================");
		
		//12.Trader based in Indore
		System.out.println("Traders based in Indore:\n");
		System.out.println( traderList.stream()
                .filter(p -> p.getCity()=="Indore")
                .sorted(Comparator.comparing(Trader::getName))
                .collect( Collectors.toList()));
		System.out.println("================================================================================================");

		//13.transaction values form traders from delhi
		System.out.println("Traders based in Indore:\n");
		System.out.println( transactionList.stream()
                .filter(p -> p.trader.getCity()=="Delhi")
                .map(p->p.getValue())
                .collect( Collectors.toList()));
		System.out.println("================================================================================================");
		
		
		//14.heighst value of all transactions
		System.out.println("Heighest value in Transaction:\n");
		System.out.println( transactionList.stream()
				.max(Comparator.comparing(Transaction::getValue)));
                //.collect( Collectors.toList()));
		System.out.println("================================================================================================");
		
		//15.transaction with smallest value
		System.out.println("Smallest value in Transaction:\n");
		System.out.println( transactionList.stream()
				.min(Comparator.comparing(Transaction::getValue)));
                //.collect( Collectors.toList()));
		System.out.println("================================================================================================");
		
	}

}

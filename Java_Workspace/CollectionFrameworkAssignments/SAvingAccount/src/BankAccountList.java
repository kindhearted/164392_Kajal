import java.util.Set;
import java.util.TreeSet;

public class BankAccountList {

	public static void main(String[] args) {

		SavingAccount acc1=new SavingAccount("Kajal", 50000, true);
		SavingAccount acc2=new SavingAccount("Akshay", 10000, true);
		SavingAccount acc3=new SavingAccount("Vaivhavi", 52000, false);
		SavingAccount acc4=new SavingAccount("Abhay", 5000, true);
		SavingAccount acc5=new SavingAccount("Sonali", 59000, true);
		SavingAccount acc6=new SavingAccount("Vinod", 55000, false);
		SavingAccount acc7=new SavingAccount("Pranita", 60000, true);
		
		Set<SavingAccount> bankAccountSet=new TreeSet<SavingAccount>();
		bankAccountSet.add(acc1);
		bankAccountSet.add(acc2);
		bankAccountSet.add(acc3);
		bankAccountSet.add(acc4);
		bankAccountSet.add(acc5);
		bankAccountSet.add(acc6);
		bankAccountSet.add(acc7);
		
		System.out.println(bankAccountSet);

		
		
		
	}

}

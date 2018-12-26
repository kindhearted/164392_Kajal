
public class SavingAccount extends BankAccount implements Comparable<SavingAccount>{

	private boolean isSalaryAccount;
	
	public SavingAccount(String accountHolderName, int accountBalance,boolean isSlaryAccount) 
	{
	
		super(accountHolderName, accountBalance);
		this.isSalaryAccount=isSlaryAccount;
	}
	
	public SavingAccount()
	{
		this.isSalaryAccount=true;
	}
	
	public boolean isSalaryAccount()
	{
		return isSalaryAccount;
	}
	
	
	

	
	@Override
	public String toString() {
		return "SavingAccount [isSalaryAccount=" + isSalaryAccount + ", toString()=" + super.toString() + "]\n";
	}

	@Override
	public void withdraw(double amount)
	{

		
		if((accountBalance<=amount)||(amount<=0))
		{
			System.out.println("Invalid Operation for Withdraw!!!");
		}
		else
		{
			this.accountBalance-=amount;
		}
		
	}

	@Override
	public int compareTo(SavingAccount s) {
		if(getAccountNo()>s.getAccountNo()){  
	        return 1;  
	    }else if(getAccountNo()<s.getAccountNo()){  
	        return -1;  
	    }else{  
	    	return 0;
	    	}
	    	
	    }  	
	}


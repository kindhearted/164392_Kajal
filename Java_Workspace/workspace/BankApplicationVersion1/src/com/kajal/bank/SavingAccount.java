package com.kajal.bank;

public class SavingAccount extends BankAccount{

	private boolean isSalaryAccount;
	
	public SavingAccount(String accountHolderName, int accountBalance)
	{
		super(accountHolderName, accountBalance);
		this.isSalaryAccount=true;
	}
	
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
}

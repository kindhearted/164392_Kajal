package com.kajal.bank;

public class CurrentAccount extends BankAccount
{
	
	private double  odLimit;
	
	{
		 odLimit=20000;
	}
	public CurrentAccount(String accountHolderName,int accountBalance)
	{
		super(accountHolderName, accountBalance);	
	}
	
	public CurrentAccount()
	{
		
	}
	
	@Override
	public void withdraw(double amount)
	{
		double diff;
		if(amount>accountBalance)
		{
			diff=amount-accountBalance;
			odLimit=odLimit-diff;
			accountBalance=0;
		}
		else
		{
			System.out.println(accountBalance-amount);
		}
		
	}
	
	public double getOdLimit()
	{
		return odLimit;
	}

	
}

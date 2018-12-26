package com.kajal.test;
import com.kajal.bank.BankAccount;
import com.kajal.bank.CurrentAccount;
import com.kajal.bank.CurrentAccountVer2;
import com.kajal.bank.SavingAccount;
import com.kajal.bank.SavingAccountVer2;

public class TestBankAccount
{
	public static void testBankAccountMethod()
	{
		//BankAccount acc=new BankAccount();
		//acc.setAccountHolderName("sachin");
		
	}
	
	public static void testSavingAccount()
	{
		SavingAccount savingAcc=new SavingAccount("kajal",15000);
		System.out.println("Account Number is "+ savingAcc.getAccountNo());
		System.out.println("Account Balance is "+ savingAcc.getAccountBalance());
		savingAcc.deposite(5000);
		System.out.println("Account Balance is "+ savingAcc.getAccountBalance());
		System.out.println("======================");
		savingAcc.withdraw(3000);
		System.out.println("Account Balance is "+ savingAcc.getAccountBalance());

	}
	
	public static void testCurrentAccount()
	{
		CurrentAccount currentAcc=new CurrentAccount("Akshay",40000);
		System.out.println("Account Number is "+ currentAcc.getAccountNo());
		System.out.println("Account Balance is "+ currentAcc.getAccountBalance());
		//currentAcc.deposite(5000);
		//System.out.println("Account Balance is "+ currentAcc.getAccountBalance());
		//System.out.println("======================");
		currentAcc.withdraw(30000);
		//System.out.println("Account Balance is "+ currentAcc.getAccountBalance());
		System.out.println("ODLimit is "+ currentAcc.getOdLimit());

	}
	
	public static BankAccount getBankAccount(String accountType)
	{
		BankAccount acc=null;
		if(accountType.equals("Saving"))
		{
			acc=new SavingAccount("Kaustubh",4000);
		}
		else if(accountType.equals("Current"))
		{
			acc =new CurrentAccount("Sonali",6000);
		}
		else
		{
			acc=null;
		}
		return acc;
	}
	
	public static void main(String[] args)
	{
		/*
		//testBankAccountMethod();
		testSavingAccount();
		testCurrentAccount();
		BankAccount acc=getBankAccount("Saving");
		
		System.out.println("Account name="+acc.getAccountHolderName());
		System.out.println("Account balance="+acc.getAccountBalance());
		acc.withdraw(1000);
		System.out.println("Account balance="+acc.getAccountBalance());*/
		
		SavingAccountVer2 acc=new SavingAccountVer2();
		acc.withdraw(400);
		acc.deposite(4000);
		acc.isSalaryAccount();
		acc.getInsuranceName();
		
		CurrentAccountVer2 acc1=new CurrentAccountVer2();
		acc1.withdraw(400);
		acc1.deposite(4000);
		acc1.getInsuranceName();


		
	}
	
}
 
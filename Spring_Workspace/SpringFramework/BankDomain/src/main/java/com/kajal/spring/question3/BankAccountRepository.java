package com.kajal.spring.question3;

public interface BankAccountRepository {
	
	public double getBalance(long accountId);
	public double updateBalance(long accountId, double newBalance);

}

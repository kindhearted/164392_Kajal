package com.kajal.bank;

public class SavingAccountVer2 extends SavingAccount implements Insurance
{

	@Override
	public String getInsuranceName()
	{
		return "Jivan Bima";
	}

	@Override
	public double getInsuranceAmount() 
	{
		return 5_00_000;
	}

}

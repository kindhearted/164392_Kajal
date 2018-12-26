package com.kajal.bank;

public class CurrentAccountVer2 extends CurrentAccount implements Insurance
{

	@Override
	public String getInsuranceName()
	{
		return "Jivan Bima Zindagi";
	}

	@Override
	public double getInsuranceAmount()
	{
		return 10_00_000;
	}

}

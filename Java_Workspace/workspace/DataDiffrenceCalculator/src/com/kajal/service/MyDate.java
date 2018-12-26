package com.kajal.service;

public class MyDate
{
	private int dd;
	private int mm;
	private int yyyy;
	
	public MyDate(int dd,int mm,int yyyy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yyyy=yyyy;		
		
	}

	@Override
	public String toString() {
		return "MyDate [dd=" + dd + ", mm=" + mm + ", yyyy=" + yyyy + "]";
	}

	public void setDd(int dd) 
	{
		this.dd = dd;
	}

	public void setMm(int mm) 
	{
		this.mm = mm;
	}

	public void setYyyy(int yyyy)
	{
		this.yyyy = yyyy;
	}

	public int getDd() 
	{
		return dd;
	}

	public int getMm()
	{
		return mm;
	}

	public int getYyyy() 
	{
		return yyyy;
	}
	
	
}

package com.kajal.service;

public class DataDifferenceProvider
{
	static final int JAN=31;
	static final int FEB=28;
	static final int MAR=31;
	static final int APR=30;
	static final int MAY=31;
	static final int JUN=30;
	static final int JUL=31;
	static final int AUG=31;
	static final int SEP=30;
	static final int OCT=31;
	static final int NOV=30;
	static final int DEC=31;
	
	int[] months= {JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC};
	
	private  boolean sameDate(MyDate startDate, MyDate endDate)
	{
		return endDate.getDd()==startDate.getDd();
	}
	
	private  boolean sameMonth(MyDate startDate, MyDate endDate)
	{
		return endDate.getMm()==startDate.getMm();
	}
	private  boolean sameYear(MyDate startDate, MyDate endDate)
	{
		return endDate.getYyyy()==startDate.getYyyy();
	}
	private boolean isLeapYear(MyDate startDate,MyDate enDate)
	{
		
		return ((((startDate.getYyyy())/4)==0)||((enDate.getYyyy())/4==0));
		
	}
	
	
	private int remainingDaysOfMonth(MyDate date)
	{
		return months[date.getMm() - 1] - date.getDd();
	}	
	private int leadingDaysInYear(MyDate endDate)
	{
		
		return 0;
	}
	private int remainingDaysInYear(MyDate startDate)
	{
		
		
		return 0;
	}	
	
	
	
	
	public int getDifference(MyDate startDate,MyDate endDate)
	{
		if((sameDate(startDate,endDate))&&(sameMonth(startDate,endDate))&&sameYear(startDate,endDate))
		{
			return 0;
		}
		else if((sameMonth(startDate,endDate))&&sameYear(startDate,endDate))
		{
			return endDate.getDd()-startDate.getDd();
		}
		else if(sameYear(startDate,endDate))
		{
			return remainingDaysOfMonth(startDate)+endDate.getDd();
		}
		else
		{
			return remainingDaysOfMonth(startDate)+endDate.getDd()+remainingDaysInYear(startDate)+leadingDaysInYear(endDate);
		}			
	}	
}

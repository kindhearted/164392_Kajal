package com.kajal.service;

public class MyTestRecord
{
		MyDate startDate;
		MyDate endDate;
		int actualDifference;
		
		public MyTestRecord(MyDate startDate,MyDate enDate, int actualDifferenece)
		{
			this.startDate=startDate;
			this.endDate=enDate;
			this.actualDifference=actualDifferenece;
		}

		public MyDate getStartDate() {
			return startDate;
		}

		public MyDate getEndDate() {
			return endDate;
		}

		public int getActualDifference() {
			return actualDifference;
		}

		public void setStartDate(MyDate startDate) {
			this.startDate = startDate;
		}

		public void setEndDate(MyDate endDate) {
			this.endDate = endDate;
		}

		public void setActualDifference(int actualDifference) {
			this.actualDifference = actualDifference;
		}
		
		
	
}

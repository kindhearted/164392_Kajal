package com.kajal.service;

public class TestDateDifferenceProvider
{
	public static void main(String[] args) {
		
	
		DataDifferenceProvider provider = new DataDifferenceProvider();
		MyTestRecord[] myTestRecords = new MyTestRecord[7];
		myTestRecords[0] = new MyTestRecord(new MyDate(20, 11, 2018), new MyDate(20, 11, 2018), 0);
		myTestRecords[1] = new MyTestRecord(new MyDate(20, 11, 2018), new MyDate(27, 11, 2018), 7);
		myTestRecords[2] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 05, 2011), 42);
		myTestRecords[3] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 06, 2011), 73);
	
		for (int index=0; index < myTestRecords.length; index++) {
			int calculatedDiff = provider.getDifference(myTestRecords[index].getStartDate(),
					myTestRecords[index].getEndDate());
			if (calculatedDiff == myTestRecords[index].getActualDifference()) {
				System.out.println("Test Case passed");
			} else {
				System.err.println("Test Case failed"+" Actual =" + myTestRecords[index].getActualDifference()+ " calculated ="+ calculatedDiff);
			}
		}

}
}

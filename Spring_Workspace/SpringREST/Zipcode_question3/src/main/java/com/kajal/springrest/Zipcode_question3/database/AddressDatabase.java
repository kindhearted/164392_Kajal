package com.kajal.springrest.Zipcode_question3.database;

import java.util.HashMap;
import java.util.Map;

import com.kajal.springrest.Zipcode_question3.model.Address;


public class AddressDatabase {

	private static Map<Long,Address> address = new HashMap();

	public static Map<Long, Address> getAddress() {
		return address;
	}

	
}

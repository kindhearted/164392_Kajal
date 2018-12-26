package com.kajal.springrest.Zipcode_question3.service;

import java.util.Map;

import com.kajal.springrest.Zipcode_question3.database.AddressDatabase;
import com.kajal.springrest.Zipcode_question3.model.Address;

public class ZipcodeService {
	
	private Map<Long,Address> addresses= AddressDatabase.getAddress();
	
	public ZipcodeService() {
		addresses.put(400101L, new Address("Mumbai", "Maharashtra", "India"));
		addresses.put(400102L, new Address("Bangalore", "Karanataka", "India"));

	}
	
	public Address getAddress(long zipcode){		
		return addresses.get(zipcode);
	}


}

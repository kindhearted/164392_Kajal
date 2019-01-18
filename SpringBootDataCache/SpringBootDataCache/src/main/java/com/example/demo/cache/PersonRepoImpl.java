package com.example.demo.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class PersonRepoImpl implements PersonRepository {

	@Override
	@Cacheable("persons")
	public Person getDetails(String name) {

		return new Person("name","Any Person");
	}
	
	public void delay(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}

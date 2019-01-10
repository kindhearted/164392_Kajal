package com.journaldev.spring.mongodb.model;

import org.springframework.data.annotation.Id;

public class Person {

	//id will be used for storing MongoDB _id
	@Id
	private String id;
	
	private String name;
	private String address;
	
	public Person(){}
	public Person(String id, String name, String addhress){
		this.id=id;
		this.name=name;
		this.address=addhress;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString(){
		return id+"::"+name+"::"+address;
	}
}

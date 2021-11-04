package com.revature.accessmodifier;

public class Person {
	private String state; //to access private-var in subclass, use getter/setter
	public int age;
	String name; 			//to access default-var in subclass, use getter/setter
	protected String city; 	//to access protected-var in subclass, use getter/setter
	
	//default constructor
	public Person() {
		this.name = "";
		this.city = "";
		this.state = "";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return this.city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	public String getState() {
		return this.state;
	}
}

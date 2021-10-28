package com.revature.model;

import java.util.Objects;

public class Person {
	
	//private instance variable to preserve the integrity of the object
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private int age;
	
	/*
	 * Java Bean:
	 * 1. Has a no-args constructor
	 * 2. getters/setters for its properties
	 * 3. Is serializable 
	 */
	public Person() {
		super();
	}
	
	//
	public Person(String firstName, String lastName, int age, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhoneNumber(){
		return this.phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [firstName="+firstName+", lastName="+lastName+", age="+age+"phone="+phoneNumber+"]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, firstName, lastName, phoneNumber);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj == null) {
			return false;
		}
		
		if(getClass() != obj.getClass()) {
			return false;
		}
		
		Person other = (Person) obj;
		return age == other.age && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(phoneNumber, other.phoneNumber);
	}
	
}
package com.revature.service;

import java.util.ArrayList;

import com.revature.dao.PersonDAO;
import com.revature.model.Person;

public class PersonService {
	
	private PersonDAO dataAccessLayer;
	
	public PersonService() {
		this.dataAccessLayer = new PersonDAO();
	}
	//This service layer contains the business logic of application
	//In this case, it will be used to validte date
	
	
	public void addPerson(Person person) {
		//see if age is a positive number
		if(person.getAge() < 0) {
			System.out.println("Error: invalid age");
			return; //immediate end...do nothing...better way is to throw an exception
		}
		
		//see if phone number matches (xxx-xxx-xxxx) pattern using regex
		String reg = "\\d{3}-\\d{3}-\\d{4}";
		if(person.getPhoneNumber().matches(reg)) {
			System.out.println("Error: invalid phone format");
			return;
		}
		
		this.addPerson(person);
	}
	
	public ArrayList<Person> getAll() {
		return this.dataAccessLayer.getAll();
	}
	
}

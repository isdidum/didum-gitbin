package com.revature.dao;

import java.util.ArrayList;
import com.revature.model.Person;

//DAO = Data Access Object
//DAO layer is to perform some action in a database
//Example: adding, deleting, retrieving, or updating data that exists in a database
public class PersonDAO {
	
	//ArrayList does not have a fix length
	private ArrayList<Person> people;
	
	//Constructor
	public PersonDAO() {
		//ArrayList does not have a fix length
		this.people = new ArrayList<> ();
	}
	
	public void add(Person per) {
		this.people.add(per);
	}
	
	public ArrayList<Person> getAll(){
		return this.people;
	}
}

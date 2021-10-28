package com.revature.dao;

import com.revature.model.Person;

//The purpose of this DAO is to store/retrieve data about people from a SQL database
public class SQLPersonDAO implements PersonDAO {
	@Override
	public void add(Person p) {
		System.out.println("Adding person to SQL database");
		// ... put database related code here
	} 
}

package com.revature.dao;

import com.revature.model.Person;

//The purpose of this DAO is to store/retrieve data about people to and from a file
public class FilePersonDAO implements PersonDAO  {
	@Override
	public void add(Person p) {
		System.out.println("Saving person data to file...");
		// Add file IO code here
	}
}

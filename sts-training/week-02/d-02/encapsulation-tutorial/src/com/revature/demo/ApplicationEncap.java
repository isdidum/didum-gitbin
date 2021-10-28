package com.revature.demo;

import java.util.ArrayList;

import com.revature.model.Person;
import com.revature.service.PersonService;

public class ApplicationEncap {

	public static void main(String[] args) {
		String firstName = "Jon";
		String lastName = "Doe";
		String phone = "512-335-2541";
		int age = 32;
		
		//Use the Person Java Bean to package the above data into a single unit
		Person p1 = new Person();
		p1.setAge(age);
		p1.setFirstName(firstName);
		p1.setLastName(lastName);
		p1.setPhoneNumber(phone);
		
		// We can then pass around all of this data by simply passing a reference to this Person object anywhere in our application
		
		// Let's pass it on over to the service layer
		PersonService service = new PersonService();
		service.addPerson(p1);
				
		ArrayList<Person> people = service.getAll();
		System.out.println(people);
				
		// Let's add a second Person
		Person p2 = new Person();
		p2.setFirstName("John");
		p2.setLastName("Doe");
		p2.setAge(100);
		p2.setPhoneNumber("342-234-3444");
				
		service.addPerson(p2);
			
		System.out.println(service.getAll());
	}

}

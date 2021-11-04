package com.revature.protectedone;

import com.revature.accessmodifier.Person;
import com.revature.protectedtwo.ProtectedSubClass;

public class AccessModifiers {

	public static void main(String[] args) {
		Person per = new Person();
		String person;
		per.age = 15;
		
		//per.name = "James"; //cannot directly access default member in another package
		per.setName("James");
		
		//per.city = "Los Angles"; //cannot directly access protected member in another package
		per.setCity("Los Angles");
		
		person = "Hi, I'm "+per.getName()+" & I'm "+per.age+", now residing in "+ per.getCity();
		System.out.println(person);
		
		ProtectedSubClass psc = new ProtectedSubClass();
		psc.printID();
	}

}

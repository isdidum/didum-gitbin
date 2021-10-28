package com.revature.dao;

import java.util.ArrayList;

import com.revature.model.Person;

public interface PersonDAO {
	int someVariable = 10; // implicitly 'public static final int someVariable'
	
	// Properties of an interface:
	// 1. All methods declared inside of an interface are implicitly public and abstract (unless they are static)
	// 2. Interfaces cannot contain instance variables
	// 		- All variables declared in an interface are implicitly public, static, and final
	
	void add(Person p); // implicitly 'public abstract void add(Person p)'
	
	// In Java 8, the default keyword was added for instance methods
	// This allows us to actually provide a default implementation without having to make the instance method abstract
	// The reason for the addition of the default keyword is that you are always required to provide an implementation in your implementing classes
	// Whatever class implements the interface must actually provide the code for that interface
	// The problem is that if a developer wants to make a change to an interface (add new methods), this would've broken existing code that was
	// written before the addition of this new method
	
	// In our scenario, this interface did not have the getAll() method originally. It only defined the add method that was required to be
	// implemented. So, developers went ahead and utilized this interface and implemented the add functionality that was required
	// Let's say another developer wants to add the getAll() method later. If they did not use the default keyword, then the method would be
	// abstract and require the developers who utilized this interface to update their code. But maybe that's not what we would really want to do
	// Therefore, here we can use the 'default' keyword to get around that requirement of implementing the getAll() method in the implementing classes
	default ArrayList<Person> getAll() {
		System.out.println("Default implementation for getAll()");
		return null;
	}
	
	// Interfaces CAN have static methods. These static methods must have an implementation, because the idea of abstract methods really only applies
	// to instance (non-static) methods
	public static void someStaticMethod() {
		System.out.println("This is a static method contained inside the interface");
	}
}

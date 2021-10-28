package com.revature.model;


/*
 * Abstraction: The idea of representing abstract ideas as types in Java
 * 
 * 	We can utilize either
 * 	1. abstract classes
 * 	2. interfaces
 * 
 * To fulfill the above definition
 */
public abstract class Shape {
	// The abstract keyword makes it so that this class is an abstract class
	
	// Properties of abstract classes:
	// 1. Can contain regular methods (concrete methods)
	// 2. Can contain abstract methods
	// 3. Cannot be instantiated (cannot create a Shape object, ex. you can't do new Shape())
	// 4. Can have constructors (even if we cannot instantiate directly, this goes back to the idea of super() in the child classes)
	protected String description;
		
	public Shape(String description) {
		this.description = description;
	}
		
	// Concrete method
//	public double getArea() {
//		// How do we know what the area of a shape is? How do we calculate the area of a shape?
//		// Here we don't really have an idea unless we know that type of shape it is
//			return 0.0;
//	}
		
	// Abstract method
	// Abstract methods do not have any implementation (code)
	// There is no code body for an abstract method
	// All we do with an abstract method is declare that it exists
	public abstract double getArea();
}

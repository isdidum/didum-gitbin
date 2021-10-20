package com.revature.model;

public class Bus {
	// default values for reference type: null
	// default values for integral types: 0 or 0.0
	// default value for boolean : false
	
	//(these are non-static fields) aka these fields are instance variables 
	public String type;
	public int numberOfWheels;
	public int year;
	public String model;
	
	/*
	 * Constructors: subroutines that are similar to methods, except that they are invoked in order to actually create the object
	 * The primary purpose of a constructor is to instantiate an object.
	 * If we do not declare any constructor in a class, JVM provides a default "no-args constructor"
	 * Constructors do not have a return type
	 * Check-out Builder Pattern for constructors
	 */
	public Bus() {
		//
	}
	
	//constructor with 1-parameters
	public Bus(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	
	//constructor with 2-parameters
	public Bus(int numberOfWheels, int year) {
		this(numberOfWheels);
		this.year = year;
	}
	
	//constructor with 3-parameters
	public Bus(int numberOfWheels, int year, String model) {
		this(numberOfWheels, year);
		this.model = model;
	}
	
	//constcutor with 4-parameters
	public Bus(int numberOfWheel, int year, String model, String type) {
		this(numberOfWheel, year, model);
		this.type = type;
	}
}

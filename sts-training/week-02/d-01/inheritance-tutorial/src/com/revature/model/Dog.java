package com.revature.model;

public class Dog extends Animal{
	// Default constructor looks like the below
	public Dog(String name) { // Whenever we construct a Dog object, we pass in an argument with its name, which we can then pass
		// over to the parent constructor that does the actual populating of its name property
		super(name); // super() is invoking the parent constructor
	}
		
	// Method overriding
	// Remember that method overloading, which we already covered in week 1, is one way of defining multiple methods with the same name
	//	Method overloading requires us to either have a different number of parameters and/or different types of parameters to distinguish
	//	between the different methods that have been defined inside the SAME CLASS
	
	// Method overriding is different
	//	Method overriding requires you to have the exact same number and type of parameters
	//	The method you want to override is located in a parent class
	//	The overriding method is a method defined in the child class
	
	// We can override the makeNoise method defined in the Animal class
	public void makeNoise() {
		System.out.println("Bark!");
	}
		
	// We are defining a method specific to Dogs
	// Animal does not have a play method defined
	// So, this is not overriding anything from Animal
	// We are just being MORE specific (adding something in addition to what was defined in the Animal class)
	// We do have 2 overloaded methods here. One takes in no arguments, and another takes in one String argument
	public void play() {
		System.out.println(super.name + " is playing!");
	}
		
	public void play(String game) {
		System.out.println(super.name + " is playing " + game);
	}
}

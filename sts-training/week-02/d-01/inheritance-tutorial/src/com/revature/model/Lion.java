package com.revature.model;

public class Lion extends Animal{
	public Lion(String name) {
		super(name);
	}
	
	// You can have multiple levels of overriding
	// For example, cat is already overriding the makeNoise method from Animal
	// We can override the makeNoise in cat yet again here in the Lion class
	public void makeNoise() {
		System.out.println("ROARRRRRR!");
	}
}

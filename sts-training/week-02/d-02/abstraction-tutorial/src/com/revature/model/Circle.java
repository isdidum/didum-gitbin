package com.revature.model;

public class Circle extends Shape {
	private double radius;
	
	public Circle(String description, double radius) {
		super(description);
		
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI; // going back to fundamentals, PI is a static variable that belongs to the Math class.
		// The Math class is a built in class within the Java runtime library that is contained inside the java.lang package
		// You don't need to import classes located inside the java.lang package- they are automatically available
	}
}

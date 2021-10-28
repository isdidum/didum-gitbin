package com.revature.model;

public class Rectangle extends Shape {
	private double length;
	private double width;
	
	public Rectangle(String description, double length, double width) {
		super(description); // Super(...) invokes the parent constructor. This is the only way to use an abstract class' constructor
		// because you cannot instantiate an abstract class
		// You will be constructing a Rectangle object, but using the Shape constructor to populate the description property 
		// defined in the abstract class
		
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		return length * width;
	}
}

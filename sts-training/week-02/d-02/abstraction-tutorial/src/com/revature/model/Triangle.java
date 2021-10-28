package com.revature.model;

public class Triangle extends Shape{
	private double base;
	private double height;
	
	public Triangle(String description, double base, double height) {
		super(description);
		
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return this.base * this.height * 0.5;
	}
}

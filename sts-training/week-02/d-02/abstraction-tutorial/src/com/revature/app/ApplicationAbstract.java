package com.revature.app;

import com.revature.model.Circle;
import com.revature.model.Rectangle;
import com.revature.model.Shape;
import com.revature.model.Triangle;

public class ApplicationAbstract {

	public static void main(String[] args) {
		// Abstraction: The idea of representing abstract ideas as types in Java
		Shape a; // Hence, we have the ability to create a Shape variable. 
		// This Shape variable can then reference any type of Shape (Rectangle, Circle, Triangle)
				
		a = new Rectangle("This rectangle is modeling the top of my desk", 20, 50);
		System.out.println(a.getArea());
				
		// Remember that a is a reference variable of the type Shape
		a = new Circle("This circle is modelling my beverage coaster", 2.5);
		System.out.println(a.getArea());
				
		a = new Triangle("This is modelling my pizza slice", 8, 20);
		System.out.println(a.getArea());
				
		// We are demonstrating not only Abstraction, but also Polymorphism here
		// Shapes have many forms. We have the getArea method that is being overridden in each specific subclass of shape
		// We are then using runtime polymorphism to determine which getArea() to actually invoke.
		// Ex. if a is pointing to a Rectangle, then use the formula for a rectangle's area
		// if a is pointing to a Circle, then use the formula for a circle's area
	}

}

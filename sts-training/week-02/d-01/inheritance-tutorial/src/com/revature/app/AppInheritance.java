package com.revature.app;

import com.revature.model.Animal;
import com.revature.model.Cat;
import com.revature.model.Dog;
import com.revature.model.Food;
import com.revature.model.Lion;

public class AppInheritance {

	public static void main(String[] args) {
		
		Food steak = new Food("Filet Mignon", 50);
		
		Animal a1 = new Dog("Fido");
		
		// A dog object can make use of all of the different properties and behaviors defined in its parent class, Animal
		a1.eat(steak);
		a1.makeNoise(); // **GENERIC ANIMAL NOISES** or Bark! ?????
		// Regardless of the fact that dog1 is an Animal reference variable, invoking makeNoise will print Bark! because the dog1 reference
		// variable is pointing to a Dog object. The type of object that a variable is pointing to is what matters, not the variable type itself
		
		Food fish = new Food("Tilapia", 25);
		
		//a1 = (Animal) new Cat("Whiskers"); //is okay
		a1 = new Cat("Whiskers");
		
		a1.eat(fish);
		a1.makeNoise();
		
		a1 = new Lion("Simba");
		a1.makeNoise();
		
		// Create a second Dog object
		Food boneMarrow = new Food("Bone Marrow", 10);
		
		Animal a1000 = new Dog("Sparky");
		a1000.eat(boneMarrow);
		a1000.makeNoise();
		
		// a1000.play(); // a1000 is pointing to a Dog object, which in the Dog class has a behavior defined called play()
		// However, this here DOES NOT work!
		// That is because the Animal type does not have play specifically defined for it
		// To make use of the play method, we need to have a Dog type variable
		// We can use downcasting to solve this
		if (a1000 instanceof Dog) { // check to see if a1000 is actually pointing to a Dog object
			
			// Downcasting
			// Showing two ways here
			
			// Way #1
//			Dog dog = (Dog) a1000;
//			
//			dog.play();
//			dog.play("Fetch");
			
			// Way #2
			((Dog) a1000).play();
			((Dog) a1000).play("Fetch");
		}
		
		Dog d1000 = new Dog("Clifford");
		d1000.play();
		
		// The type of reference variable is what gives you access to certain methods and properties
		// But depending on the type of object, the type of object has those properties and methods all along
		// A good analogy is that the reference variable type is kind of like a piece of paper with punchholes in it that reveal
		// text written underneath another piece of paper
		// Example: If you have an Animal variable and it is referring to a Dog object, the Dog object ALWAYS has the properties: name,
		// energyLevel and the behaviors: makeNoise, eat, AND play (defined in Dog), but play is inaccessible if you are utilizing the
		// Animal type
		// It only becomes available to use if you have a Dog type variable
		
		/*
		 * Object class methods
		 * 	.equals()
		 * 	.toString()
		 * 	.hashCode()
		 */
		
		// equals()
		String s1 = "hello"; // String pool
		String s2 = new String("hello"); // regular part of heap
		System.out.println("s1 == s2: " + (s1 == s2)); // false because s1 and s2 point to different objects
		System.out.println("s1.equals(s2): " + (s1.equals(s2))); // true, because the equals method here is comparing the characters
		// inside each string object and whether they have exactly the same characters or not
		// the equals method is an example of method overriding. The String class overrides the equals method in the Object class
		
		// We are creating two different animal objects with the same name (and energyLevel)
		// What if we want a way to compare Dog objects that have the same name and energyLevel?
		// WE can't use == because all that does is compare what objects the variables are pointing to
		// We can instead override the equals method
		Animal a10000 = new Dog("Fido");
		Animal a10001 = new Dog("Fido");
		
		System.out.println(a10000.equals(a10001)); // Prints true because even though they are different objects from each other,
		// they have the same name and energyLevel
		// We overrode the equals method in the Object class to compare the property values instead of object locations
		// By default, the equals method will compare object locations (same as ==)
		
		// toString()
		System.out.println(a10000); 
		// by default, printing out an object gives you something like this:
		// com.revature.model.Dog@cae86c6f
		// It is the type of object followed by the memory location of the object (in particualr, the hashed memory location of the object)
		//
	}

}

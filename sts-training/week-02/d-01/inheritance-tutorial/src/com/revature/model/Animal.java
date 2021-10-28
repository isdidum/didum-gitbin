package com.revature.model;

import java.util.Objects;

//parent of all Animal...define properties and behavior common to all Animals here...
public class Animal {
	// Properties
	public String name;
	public double energyLevel;
		
	// Constructor(s)
	public Animal(String name) {
		this.name = name;
		this.energyLevel = 100;
	}
		
	// Behaviors (instance methods)
	public void makeNoise() {
		System.out.println("**GENERIC ANIMAL NOISES**");
	}
		
	public void eat(Food food) {
		this.energyLevel += food.nourishmentValue;
		System.out.println(this.name + " ate " + food.foodName 
			+ " and increased its energy level by " 
			+ food.nourishmentValue + ". It now has an energyLevel of " 
			+ this.energyLevel);
	}

	@Override
	public int hashCode() {
		return Objects.hash(energyLevel, name);
	}

	@Override
	public boolean equals(Object obj) {
	
		if (this == obj) {
			return true;
		}
	
		if (obj == null) {
			return false;
		}
	
		if (getClass() != obj.getClass()) {
			return false;
		}
		Animal other = (Animal) obj;
			return Double.doubleToLongBits(energyLevel) == Double.doubleToLongBits(other.energyLevel)
				&& Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + this.name + ", energyLevel=" + this.energyLevel + "]";
	}
}

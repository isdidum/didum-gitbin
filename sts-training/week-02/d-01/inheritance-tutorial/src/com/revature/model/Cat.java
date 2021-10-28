package com.revature.model;

public class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}
	
	public void makeNoise() {
		System.out.println("Meow!");
	}
}

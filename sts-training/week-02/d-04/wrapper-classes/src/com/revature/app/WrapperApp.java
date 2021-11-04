package com.revature.app;

public class WrapperApp {

	public static void main(String[] args) {
		
		//unboxing
		Integer i = new Integer(10);
		System.out.println(i+5);
		
		//Math Object requires you to use primitive data-type
		
		//another unboxing
		int someInt = i;
		System.out.println(someInt);
		
		//unboxing arguments
		printInt(i);
		
		//Autoboxing
		Integer i2 = 10;
		Integer i3 = 15;
		Integer i4 = i2 + i3;
	}
	
	public static void printInt(int a) {
		System.out.println(a);
	}

}

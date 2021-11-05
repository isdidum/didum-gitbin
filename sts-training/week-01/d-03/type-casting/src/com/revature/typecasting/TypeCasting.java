package com.revature.typecasting;

public class TypeCasting extends Object{
	public TypeCasting(){
		//default constructor
	}
	
	public static void main(String[] args) {
		/*
		 * Widening/narrowing conversions (primitive type)
		 * Upcasting/downcasting conversion (reference type)
		 * 
		 * Widening/narrowing conversion
		 * 
		 * byte, short, char, int, long, float, double
		 * 
		 * implicit: occurs when you want ot fit a narrower type into a larger type
		 * explicit: we need to explicitly specify that we want to convert from a wider type to a narrower type
		 */
		
		//Implicit type-casting
		long myLong;
		int myInt = 1000;
		
		//Explicit type-casting
		myLong = myInt;
		int myInt2; //myLong has a value of 1000
		myInt2 = (int) myLong;
		
		System.out.println("myInt2: "+ myInt2);
		myInt2 = (int) 3_000_000_000L;
		
	}
}

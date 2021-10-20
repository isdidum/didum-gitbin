package com.revature.app;

import com.revature.model.Bus;

public class Main {
	// this is a single line comment
	/* multi-line comment*/
	
	/*
	 * Variables
	 * Primitive Types: directly stores values "within them" in memory
	 * Reference Types: refer to other location in memory. In particular, reference variables "point" to the location of objects in memory
	 * 
	 * Within memory (RAM), two separate memory: stack & heap
	 * 
	 * From smallest to biggest
	 * 1. boolean: JVM dependent (JVM allocates, typically 1-bit)
	 * 2. byte: 8 bits (either 9 or 1) [Range: -128 to 127]
	 * 		whole number only (integral type)
	 * 
	 * 3. short: 16 bits [Rabge: -32768 to 32768]
	 * 		whole number only (integral type)
	 * 
	 * 4. char: 16 bits (stores single characters: 'a', "A", '$', 'Z', '1') [Range: 0 to 65535]
	 * 		whole number only (integral type)
	 * 
	 * 5. int: 32 bits [Range: -2,147,483,648 to 2,147,483,647]
	 * 		whole number only (integral type)
	 * 
	 * 6. long: 64 bits [Range: -9,223,371,036,775,808 to 9,223,371,036,775,808]
	 * 
	 * 7. float: 32 bits [Range: (+/-) 1.2*10^(-38) to 3.4 * 10^38]
	 * 		Represent numbers with decimals (floating point type)
	 * 
	 * 8. double: 64 bits [Range: (+/-) 2.3 * 10^(-308) to 1.7 * 10^308]
	 * 		Represent numbers with decimals (floating point type)
	 * 
	 */
	public static void main(String[] args) {
		primitiveExample();
		referenceExample();
	}
	
	public static void primitiveExample(){
		// 8 bits
		byte myByte; //variable declaration
		myByte = 10; //initialize the variable
				
		byte anotherByte = 10; //declaring and initializing
				
		System.out.println(myByte);
		System.out.println("another Byte: "+anotherByte);
				
		//16 bits
		short myShort = 25_767; //underscore cannot be beginning or end, but only in the middle.
		System.out.println(myShort);
			
		char myChar = 'A';
		myChar = 1000;
		System.out.println(myChar);
		
		//32 bits
		int myInt = 2_000_123_100; //
		System.out.println(myInt);
		
		//64 bits
		//long myLong = 323423453556633; // this number is out of long range, not okay
		long longs = 323423453556633L; // with 'L', we signify that this number is a 'long literal'...this is ok
		System.out.println(longs);
		
		//floating type ...specify float literal by putting 'f' at end
		float myFloat = 3.14159f; //a decimal number by default is a double literal.
		System.out.println(myFloat);
		
		double myDouble = 3.14159; // Doubles are larger thatn floats
		System.out.println(myDouble);
		
		boolean myBool = true;
		myBool =(10 == 100);
		System.out.println(myBool);
	}
	
	public static void referenceExample(){
		// reference variable can either be null or points to an object
		// reference variables refer to the location of an object
		Bus bs = null;
		bs = new Bus(); //keyword new reserves memory space for the object
		
		System.out.println(bs.model);
		System.out.println(bs.numberOfWheels);
		System.out.println(bs.type);
		System.out.println(bs.year);
		
		Bus bs2 = new Bus(8, 2020, "Some Model", "Express"); //we're passing in 4 arguments (actual values)
		
		System.out.println(bs2.model);
		System.out.println(bs2.numberOfWheels);
		System.out.println(bs2.type);
		System.out.println(bs2.year);
	}
}

package com.revature.stringapi;

public class StringDriver {
	public static void main(String[] args) {
		String s1 = "Hello world";
		char cArr[] = {'H','e','l','l','o',' ','w','o','r','l','d'}; //primitive literal
		
		/* Strings are immutable reference object
		 * Strings are stored in the String Pool in Heap memory
		 * concat and other string methods create objects in the regular part of Heap memory, not the String Pool memory
		 */
		String s2 = new String(cArr);
		//both long and float literals are denoted with 298L & 298.8f, respectively
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		
		System.out.println("s1 == s2: "+ (s1 == s2)); //false because s1 & s2 do not point to the object
		System.out.println("s1.equals(s2): "+(s1.equals(s2))); //true b/c both s1 & s2 have same value
		
		String s5 = "Hello, world, my, name, is, Didum";
		String str[] = s5.split(", ");
		for(String st: str) {
			System.out.println("String: "+st);
		}
	}
}

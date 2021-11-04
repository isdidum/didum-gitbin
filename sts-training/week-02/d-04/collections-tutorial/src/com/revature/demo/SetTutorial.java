package com.revature.demo;

//import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTutorial {
	public static void setDemo() {
		/*
		 * Sets
		 * 1. Do not have an index
		 * 2. Can only contain unique elements (no duplicates)
		 */
		//Set<String> mySet = new HashSet<>();
		Set<String> mySet = new TreeSet<>();
		
		mySet.add("Peach");
		mySet.add("Avocado");
		mySet.add("Mangosteen");
		mySet.add("Banana");
		mySet.add("Banana");
		
		System.out.println("mySet: "+mySet);
		//for()
	}
}

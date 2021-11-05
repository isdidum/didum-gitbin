package com.revature.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.revature.generic.GenericWrapper;
public class GenericApp {

	public static void main(String[] args) {
		/*
		 * Integer within the angle brackets can be any object, such as:
		 * 1. Double, Float, String, Byte, Long, Short, Boolean, Character
		 * 2. You can also apply custom Java objects within the angle brackets
		 * 3. custom Java objects are objects created by you 
		 */
		GenericWrapper<Integer> gi = new GenericWrapper<>(10); //parameterized constructor call
		GenericWrapper<String> gs = new GenericWrapper<>("Name is Didum."); ////parameterized constructor call
		GenericWrapper<Double> gd = new GenericWrapper<>(3.14); ////parameterized constructor call
		
		System.out.println("Integer: "+ gi.getValue());
		System.out.println("String: "+ gs.getValue());
		System.out.println("Double: "+ gd.getValue());
		
		System.out.println("Double: "+ gd.getClass());
		System.out.println("toString: "+gi.toString());
		
		List<String> test = new ArrayList<>();
		test.add("Java");
		test.add("ActionScript");
		test.add("JavaScript");
		test.set(1, "SQL");
		test.add(0, "JSON");
		
		test.addAll(Arrays.asList("2", "7", "11"));
		test.addAll(3, Arrays.asList("3", "5"));
		
		//complex generic object
		GenericWrapper<List<Object>> list = new GenericWrapper<List<Object>>();
		list.setValue(test);
		//System.out.println("List items = "+list.getValues()); //[JSON, Java, SQL, 3, 5, JavaScript, 2, 7, 11]
		System.out.println("List items = "+list.getValue()); //[JSON, Java, SQL, 3, 5, JavaScript, 2, 7, 11]
		
		//call to default GenericWrapper constructor
		//GenericWrapper<String> str = new GenericWrapper<String>(); //ok
		GenericWrapper<Object> str = new GenericWrapper<Object>();
		str.setValue("The default constructor");
		System.out.println("Calling df-c: "+str.getValue());
	}

}

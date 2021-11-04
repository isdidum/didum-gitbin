package com.revature.demo;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTutorial {
	public static void mapDemo() {
		/*
		 * Maps: are key-value pairs
		 * 1. Keys are use to retrieve associated value
		 * 2. The retrieval of the value occurs in O(1) time ...Big-O-Notation
		 * 3. Keys are unique
		 * 4. Values do not have to be unique
		 */
		String myStr = "asd;lfj;";
		
		//Note down Character, Integer are wrapper classes
		//Collections cannot store primitive types
		Map<Character, Integer> fChar = new HashMap<>();
		
		for(int i=0; i <= myStr.length()-1; i++) {
			char c = myStr.charAt(i);
			
			if(fChar.get(c) == null) {
				fChar.put(c, 1);
			} else {
				fChar.put(c, fChar.get(c)+1);
			}
		}
		
		Set<Character> uChar = fChar.keySet();
		
		for(Character c : uChar) {
			System.out.println(c);
		}
		
		//Entry is an anonymous class inside of Map
		Set<Entry<Character,Integer>> kvs = fChar.entrySet();
		for(Entry<Character,Integer> kv : kvs ) {
			System.out.println(kv.getKey() + ": value = "+ kv.getValue());
		}
		
		System.out.println("number of d's: "+fChar.get('d'));
	}
}

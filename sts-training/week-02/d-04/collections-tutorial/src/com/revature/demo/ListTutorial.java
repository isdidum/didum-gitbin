package com.revature.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListTutorial {
	
	public static void listDemo() {
		/*
		 * Compare Arrays vs Lists
		 * 1. Both are indexed (zero-based)
		 * 2. Arrays are fixed in size
		 * 3. List are NOT fixed in size
		 * 4. Using .length, you can get an element in Array
		 * 5. For list, you can use method .size() and .get(int index)
		 * 6. Both can have duplicate values
		 */
		
		//List<String> lists0 = new ArrayList<String>();
		
		List<String> lists = new ArrayList<>();
		
		lists.add("Mango");
		lists.add("Peach");
		lists.add("Banana");
		lists.add("Pineapple");
		lists.add("Grapes");
		lists.add("Apple");
		lists.add("Orange");
		
		System.out.println("list = "+lists);
		System.out.println("list = "+lists.size());
		
		lists.remove(new String("Peach"));
		
		System.out.println("new list = "+lists);
		
		for(int i=0; i<lists.size(); i++) {
			System.out.println("index: "+i+": "+lists.get(i));
		}
		
		for(String s : lists) {
			System.out.println(s);
		}
		
		Iterator<String> itr = lists.iterator();
		while( itr.hasNext() ) {
			String nextItem = itr.next();
			if(nextItem.equals("Banana"))
				itr.remove(); //should remove all bananas
		}
		System.out.println("All bananas are gone: "+ lists);
		
		//Enhanced for-loop ... short-cut way of doing same thing
		for(String s : lists) {
			System.out.println(s);
		}
		
		Iterator<String> itr1 = lists.iterator();
		while( itr1.hasNext() ) {
			System.out.println("All bananas are gone: "+ lists);
		}
		
		/* Enhance for-loop can be used for anything <Iterable>
		 * Collection vs Collections
		 * 
		 * Collection: an interface that is part of the Collection API hierachy
		 * Collections: a class that NOTHING else inherits...a utility class
		 * Utility class contains only useful static methods
		 */
		Collections.reverse(lists);
		System.out.println("reverse-list = "+lists);
		
		Collections.sort(lists); //sorts the list alphabetically
		System.out.println("sorted-list = "+lists);
		
		Collections.shuffle(lists); //sorts the list alphabetically
		System.out.println("shuffled-list = "+lists);
	}
}

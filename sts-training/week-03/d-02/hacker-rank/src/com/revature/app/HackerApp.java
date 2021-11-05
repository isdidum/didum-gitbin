package com.revature.app;
import  java.util.List;
import  java.util.ArrayList;

public class HackerApp {

	public static void main(String[] args) {
		List<Integer> b = new ArrayList<>();
		b.add(10);
		b.add(15);
		b.add(5);
		
		System.out.println("Sum = "+sumArray(b));
	}
	
	public static int sumArray(List<Integer> ints) {
		int rst = 0;
		for(int i=0; i<ints.size(); i++) {
			rst += ints.get(i);
		}
		return rst;
		
		/*using enhanced for-loop
		 * for(Integer i: ints) {
			rst += i;
		}*/
	}
}

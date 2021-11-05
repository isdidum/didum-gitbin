package com.revature.app;

import com.revature.utility.MathUtility;

public class StaticMain {
	public static void main(String[] args) {
		StaticMain.staticMethod();
		
		int result = MathUtility.power(2,4);
		System.out.println("2 to the power of 4 = "+result);
	}
	
	public static void staticMethod() {
		System.out.println("Invoking static method");
	}
}

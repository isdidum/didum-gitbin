package com.revature.utility;

public class MathUtility {
	
	MathUtility(){}
	
	public static int power(int base, int exponent) {
		int result = 1;
		for(int i=0; i<= exponent; i++) {
			result *= base; //result = result * base;
		}
		
		return result;
	}
	
	public static double calculateCircleArea(double radius) {
		return 3.14159 * radius * radius;
	}
}

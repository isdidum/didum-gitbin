package com.revature.app;

public class VarArgs {
	public static void main(String[] args) {
	//public static void main(String... args) {
		//System.out.println("Hello "+args[0]+ " & "+ args[1]);
		System.out.println("Var-args: "+ getSum(1.5, 2.5, 3.2, 4.1, 2, 1.1, 10, 20) );
		System.out.println("No-args: "+ getSum() );
		System.out.println("Single-args: "+ getSum(10.4) );
	}
	
	//var-args are treated like arrays (a reference type)
	//var-args is zero or more parameters
	public static double getSum(/*double d1, double d2,*/ double...numbers) {
		double sum = 0;
		//sum += d1; //invalidates getSum() and getSum(10.4)
		//sum += d2;
		if(numbers.length == 0) {
			return 0.0;
		}
		
		for(double n : numbers) {
			sum += n;
		}
		return sum;
	}
}

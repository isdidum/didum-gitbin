package com.revature.service;

public class ArithmeticService {
	public String doAddition(String numStr1, String numStr2) {
		double num1 = Double.parseDouble(numStr1);
		double num2 = Double.parseDouble(numStr2);
		
		double sum = num1 + num2;
		String result = "" + sum;
		return result;
	}
	
	public String performSubtraction(String numStr1, String numStr2) {
		double num1 = Double.parseDouble(numStr1);
		double num2 = Double.parseDouble(numStr2);
		
		double sum = num1 - num2;
		String result = "" + sum;
		return result;
	}
	
	public String performDivision(String numStr1, String numStr2) {
		double num1 = Double.parseDouble(numStr1);
		double num2 = Double.parseDouble(numStr2);
		
		double sum = num1 / num2;
		String result = "" + sum;
		return result;
	}
	
	public String performMultiplication(String numStr1, String numStr2) {
		double num1 = Double.parseDouble(numStr1);
		double num2 = Double.parseDouble(numStr2);
		
		double sum = num1 * num2;
		String result = "" + sum;
		return result;
	}
	
	public String performPowerOf(String numStr1, String numStr2) {
		double num1 = Double.parseDouble(numStr1);
		double num2 = Double.parseDouble(numStr2);
		
		double sum = Math.pow(num1, num2);
		String result = "" + sum;
		return result;
	}
}

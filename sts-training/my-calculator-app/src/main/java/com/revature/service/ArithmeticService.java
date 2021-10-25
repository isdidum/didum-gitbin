package com.revature.service;

public class ArithmeticService {
	
	//public String doAddition(String numStr1, String numStr2) {
	public String performAddition(String numStr1, String numStr2) {
		double num1 = Double.parseDouble(numStr1);
		double num2 = Double.parseDouble(numStr2);
		
		double sum = num1 + num2;
		String result = "" + sum;
		return result;
	}
	
	public String performSubtraction(String numStr1, String numStr2) {
		double num1 = Double.parseDouble(numStr1);
		double num2 = Double.parseDouble(numStr2);
		
		double diff = num1 - num2;
		String result = "" + diff;
		return result;
	}
	
	public String performDivision(String numStr1, String numStr2) {
		double num1 = Double.parseDouble(numStr1);
		double num2 = Double.parseDouble(numStr2);
		
		double quot = num1 / num2;
		String result = "" + quot;
		return result;
	}
	
	public String performMultiplication(String numStr1, String numStr2) {
		double num1 = Double.parseDouble(numStr1);
		double num2 = Double.parseDouble(numStr2);
		
		double prod = num1 * num2;
		String result = "" + prod;
		return result;
	}
	
	public String performPower(String numStr1, String numStr2) {
		double num1 = Double.parseDouble(numStr1);
		double num2 = Double.parseDouble(numStr2);
		
		double pow = Math.pow(num1, num2);
		String result = "" + pow;
		return result;
	}
	
	public String performExponent(String numStr) {
		double num = Double.parseDouble(numStr);
		
		double exp = Math.exp(num);
		
		String result = "" + exp;
		return result;
	}
}

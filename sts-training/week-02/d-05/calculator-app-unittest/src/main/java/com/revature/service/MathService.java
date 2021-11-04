package com.revature.service;

public class MathService {
	public int inspectInputs(String input1, String input2) {
		if(input1.trim().equals("") && input2.trim().equals("")) {
			return 3;
		}
		
		if(input1.trim().equals("")) {
			return 1;
		}
		
		if(input2.trim().equals("")) {
			return 2;
		}
		
		//neither are blank
		return 0;
	}
	
	public String performOperation(String input1, String input2, char operator) {
		int condition = inspectInputs(input1, input2);
		
		switch(condition) {
			case 1:
				return "Left input is missing";
			case 2:
				return "Right input is missing";
			case 3:
				return "Both inputs are missing";
		}
		
		switch(operator) {
			case '+':
				return performAddition(input1, input2);
			case '-':
				return performSubtraction(input1, input2);
			case '/':
				return performDivision(input1, input2);
			case '*':
				return performMultiplication(input1, input2);
			case '^':
				return performPower(input1, input2);
			//case 'e':
			//	return performExponent(input1);
		}
		return "Logic bypassed or something went wrong.";
	}
	
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

package com.revature.service;

import com.revature.exception.MissingInputException;

public class ServiceException {
	
	public void inspectInput(String lhs, String rhs) {
		if(lhs.trim().equals("") && rhs.trim().equals("")) {
			throw new MissingInputException("Both inputs are missing");
		}
		
		if(lhs.trim().equals("")) {
			throw new MissingInputException("Left input missing");
		}
		
		if(rhs.trim().equals("")) {
			throw new MissingInputException("Right input missing");
		}
	}
	
	public String performAddition(String numStr1, String numStr2) {
		inspectInput(numStr1, numStr2);
		
		double num1 = Double.parseDouble(numStr1);
		double num2 = Double.parseDouble(numStr2);
		double sum = num1 + num2;
		String result = "" + sum;
		return result;
	}
		
	public String performSubtraction(String numStr1, String numStr2) {
		inspectInput(numStr1, numStr2);
		
		double num1 = Double.parseDouble(numStr1);
		double num2 = Double.parseDouble(numStr2);
		double diff = num1 - num2;
		String result = "" + diff;
		return result;
	}
		
	public String performDivision(String numStr1, String numStr2) {
		inspectInput(numStr1, numStr2);
		
		double num1 = Double.parseDouble(numStr1);
		double num2 = Double.parseDouble(numStr2);
		double quot = num1 / num2;
		String result = "" + quot;
		return result;
	}
		
	public String performMultiplication(String numStr1, String numStr2) {
		inspectInput(numStr1, numStr2);
		
		double num1 = Double.parseDouble(numStr1);
		double num2 = Double.parseDouble(numStr2);
		double prod = num1 * num2;
		String result = "" + prod;
		return result;
	}
		
	public String performPower(String numStr1, String numStr2) {
		inspectInput(numStr1, numStr2);
		
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

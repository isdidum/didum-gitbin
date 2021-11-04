package com.revature.controller;

import com.revature.service.MathService;

import io.javalin.Javalin;
import io.javalin.http.Handler;

public class MathController {
public MathService mathService;
	
	//default constructor
	public MathController() {}
	
	//parameterized constructor
	public MathController(MathService mathService) {
		this.mathService = mathService;
	}
	
	/*
	 * This is lambda. It is similar to a method, but can be passed around
	 */
	public Handler add = (ctx) -> {
		ctx.result("add lambda invoke");
		
		//Double class has a static method (parseDouble), accepts a String & returns a double primitive of String representation
		String numStr1 = ctx.formParam("number1");
		String numStr2 = ctx.formParam("number2");
		ctx.result(mathService.performOperation(numStr1, numStr2, '+'));
		//ctx.result(mathService.performAddition(numStr1, numStr2));
		
		//double num1 = Double.parseDouble(numStr1);
		//double num2 = Double.parseDouble(numStr2);
		//double sum = num1 + num2;
		//ctx.result("" + sum);
	};
	
	/*
	 * subtract() - lambda method
	 */
	public Handler subtract = (ctx) -> {
		ctx.result("subtract lambda invoke");
		
		String numStr1 = ctx.formParam("number1");
		String numStr2 = ctx.formParam("number2");
		ctx.result(mathService.performOperation(numStr1, numStr2, '-'));
		//ctx.result(mathService.performSubtraction(numStr1, numStr2));
		
		//double num1 = Double.parseDouble(numStr1);
		//double num2 = Double.parseDouble(numStr2);
		//double sum = num1 - num2;
		//ctx.result("" + sum);
	};
	
	/*
	 * multiply() - lambda method
	 */
	public Handler multiply = (ctx) -> {
		ctx.result("multiply lambda invoke");
		
		String numStr1 = ctx.formParam("number1");
		String numStr2 = ctx.formParam("number2");
		ctx.result(mathService.performOperation(numStr1, numStr2, '*'));
		//ctx.result(mathService.performMultiplication(numStr1, numStr2));
		//double num1 = Double.parseDouble(numStr1);
		//double num2 = Double.parseDouble(numStr2);
		//double sum = num1 * num2;
		//ctx.result("" + sum);
	};
	
	/*
	 * divide() - lambda method
	 */
	public Handler divide = (ctx) -> {
		ctx.result("divide lambda invoke");
		
		String numStr1 = ctx.formParam("number1");
		String numStr2 = ctx.formParam("number2");
		ctx.result(mathService.performOperation(numStr1, numStr2, '/'));
		//ctx.result(mathService.performDivision(numStr1, numStr2));
		//double num1 = Double.parseDouble(numStr1);
		//double num2 = Double.parseDouble(numStr2);
		//double sum = num1 / num2;
		//ctx.result("" + sum);
	};
	
	/*
	 * power() - lambda method
	 */
	public Handler power = (ctx) -> {
		ctx.result("power lambda invoke");
		String numStr1 = ctx.formParam("number1");
		String numStr2 = ctx.formParam("number2");
		ctx.result(mathService.performOperation(numStr1, numStr2, '^'));
		//ctx.result(mathService.performPower(numStr1, numStr2));
	};
	
	/*
	 * power() - lambda method
	 */
	public Handler exponent = (ctx) -> {
		ctx.result("exponent lambda invoke");
		String numStr = ctx.formParam("number1");
		ctx.result(mathService.performExponent(numStr));
	};
	
	/**
	 * registerEndpoint() - maps each lambda, which will be invoked whenever a client sends an HTTP Request
	 * @param app
	 */
	public void registerEndpoint(Javalin app) { 
		app.post("/add", add);
		app.post("/subtract", subtract);
		app.post("/multiply", multiply);
		app.post("/divide", divide);
		app.post("/power", power);
		app.post("/exponent", exponent);
	}
}

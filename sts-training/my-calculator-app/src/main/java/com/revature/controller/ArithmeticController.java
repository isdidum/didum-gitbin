package com.revature.controller;

import com.revature.service.ArithmeticService;

import io.javalin.Javalin;
import io.javalin.http.Handler;

//@SuppressWarnings("unused") //suppresses warning on <import io.javalin.Javalin;>
public class ArithmeticController {
	
	public ArithmeticService arithService;
	
	//default constructor
	public ArithmeticController() {}
	
	//parameterized constructor
	public ArithmeticController(ArithmeticService arithService) {
		this.arithService = arithService;
	}
	
	/*
	 * This is lambda. It is similar to a method, but can be passed around
	 */
	public Handler add = (ctx) -> {
		ctx.result("add lambda invoke");
		
		//Double class has a static method (parseDouble), accepts a String & returns a double primitive of String representation
		String numStr1 = ctx.formParam("number1");
		String numStr2 = ctx.formParam("number2");
		
		double num1 = Double.parseDouble(numStr1);
		double num2 = Double.parseDouble(numStr2);
		
		double sum = num1 + num2;
		ctx.result("" + sum);
	};
	
	/*
	 * subtract() - lambda method that can be passed around
	 */
	public Handler subtract = (ctx) -> {
		ctx.result("add lambda invoke");
		
		//Double class has a static method (parseDouble), accepts a String & returns a double primitive of String representation
		String numStr1 = ctx.formParam("number1");
		String numStr2 = ctx.formParam("number2");
		
		double num1 = Double.parseDouble(numStr1);
		double num2 = Double.parseDouble(numStr2);
		
		double sum = num1 - num2;
		ctx.result("" + sum);
	};
	
	/*
	 * multiply() - lambda method that can be passed around
	 */
	public Handler multiply = (ctx) -> {
		ctx.result("add lambda invoke");
		
		//Double class has a static method (parseDouble), accepts a String & returns a double primitive of String representation
		String numStr1 = ctx.formParam("number1");
		String numStr2 = ctx.formParam("number2");
		
		double num1 = Double.parseDouble(numStr1);
		double num2 = Double.parseDouble(numStr2);
		
		double sum = num1 * num2;
		ctx.result("" + sum);
	};
	
	/*
	 * divide() - lambda method that can be passed around
	 */
	public Handler divide = (ctx) -> {
		ctx.result("add lambda invoke");
		
		//Double class has a static method (parseDouble), accepts a String & returns a double primitive of String representation
		String numStr1 = ctx.formParam("number1");
		String numStr2 = ctx.formParam("number2");
		
		double num1 = Double.parseDouble(numStr1);
		double num2 = Double.parseDouble(numStr2);
		
		double sum = num1 / num2;
		ctx.result("" + sum);
	};
	
	/*
	 * power() - lambda method that can be passed around
	 */
	public Handler power = (ctx) -> {
		ctx.result("add lambda invoke");
		
		//Double class has a static method (parseDouble), accepts a String & returns a double primitive of String representation
		String numStr1 = ctx.formParam("number1");
		String numStr2 = ctx.formParam("number2");
		
		double num1 = Double.parseDouble(numStr1);
		double num2 = Double.parseDouble(numStr2);
		
		double sum = Math.pow(num1, num2);
		ctx.result("" + sum);
	};
	
	/**
	 * registerEndpoint() - invokes all lambdas
	 * @param app
	 */
	public void registerEndpoint(Javalin app) {
		// maps the add lambda, which will be invoked whenever a client sends an HTTP Request to "/add"
		app.post("/add", add);
		app.post("/subtract", subtract);
		app.post("/multiply", multiply);
		app.post("/divide", divide);
		app.post("/power", power);
	}
}

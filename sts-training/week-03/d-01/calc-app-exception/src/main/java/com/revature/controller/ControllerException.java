package com.revature.controller;

import com.revature.exception.MissingInputException;
import com.revature.service.ServiceException;

import io.javalin.Javalin;
import io.javalin.http.Handler;

public class ControllerException {
	public ServiceException arithService;
	
	//default constructor
	public ControllerException() {}
	
	//parameterized constructor
	public ControllerException(ServiceException arithService) {
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
		try {
			ctx.result(arithService.performAddition(numStr1,numStr2));
		} catch (MissingInputException err) {
			ctx.result(err.getMessage());
		}
	};
	
	/*
	 * subtract() - lambda method
	 */
	public Handler subtract = (ctx) -> {
		ctx.result("subtract lambda invoke");
		
		String numStr1 = ctx.formParam("number1");
		String numStr2 = ctx.formParam("number2");
		
		try {
			ctx.result(arithService.performSubtraction(numStr1,numStr2));
		} catch (MissingInputException err) {
			ctx.result(err.getMessage());
		}
	};
	
	/*
	 * multiply() - lambda method
	 */
	public Handler multiply = (ctx) -> {
		ctx.result("multiply lambda invoke");
		
		String numStr1 = ctx.formParam("number1");
		String numStr2 = ctx.formParam("number2");
		try {
			ctx.result(arithService.performMultiplication(numStr1,numStr2));
		} catch (MissingInputException err) {
			ctx.result(err.getMessage());
		}
	};
	
	/*
	 * divide() - lambda method
	 */
	public Handler divide = (ctx) -> {
		ctx.result("divide lambda invoke");
		
		String numStr1 = ctx.formParam("number1");
		String numStr2 = ctx.formParam("number2");
		try {
			ctx.result(arithService.performDivision(numStr1,numStr2));
		} catch (MissingInputException err) {
			ctx.result(err.getMessage());
		}
	};
	
	/*
	 * power() - lambda method
	 */
	public Handler power = (ctx) -> {
		ctx.result("power lambda invoke");
		String numStr1 = ctx.formParam("number1");
		String numStr2 = ctx.formParam("number2");
		try {
			ctx.result(arithService.performPower(numStr1, numStr2));
		} catch (MissingInputException err) {
			ctx.result(err.getMessage());
		}
	};
	
	/*
	 * power() - lambda method
	 */
	public Handler exponent = (ctx) -> {
		ctx.result("exponent lambda invoke");
		String numStr = ctx.formParam("number1");
		ctx.result(arithService.performExponent(numStr));
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

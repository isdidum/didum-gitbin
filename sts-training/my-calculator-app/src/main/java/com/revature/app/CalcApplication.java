package com.revature.app;

import com.revature.controller.ArithmeticController;
import com.revature.service.ArithmeticService;

import io.javalin.Javalin;

public class CalcApplication {
	public static void main(String[] args) { //what server host name should we use for the post request?  
		Javalin app = Javalin.create();
		
		ArithmeticController ctrl = new ArithmeticController(new ArithmeticService());
		//ArithmeticController ctrl = new ArithmeticController();
		ctrl.registerEndpoint(app);
		
		app.start(8080);
	}
}

package com.revature.app;

import com.revature.controller.MathController;
import com.revature.service.MathService;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class MathCalculatorApp {
	
	/*
	 * 1. Right-click -> Run As -> Java Application : starts up Javalin Server
	 * 2. Copy the absolute path in step-3 and paste into a browser
	 * 3. file:///C:/Users/dee/Documents/revature/training/wk01/day5/calc-frontend/index.html
	 */
	public static void main(String[] args) {
		//Javalin app = Javalin.create();
		Javalin app = Javalin.create(config -> {
			//This hosts the static html file on the server
			config.addStaticFiles("/", Location.CLASSPATH);
		});
		
		MathController ctrl = new MathController(new MathService());
		ctrl.registerEndpoint(app);
		
		app.start(8080);
	}

}

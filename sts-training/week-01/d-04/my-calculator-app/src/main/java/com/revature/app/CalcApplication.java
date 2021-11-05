package com.revature.app;

import com.revature.controller.ArithmeticController;
import com.revature.service.ArithmeticService;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

/*
 * startup the server by right-clicking this file w/ main method -> Run As -> Java Application
 * update the server by right-clicking on Maven Project -> Maven -> Update Project...OK
 * The whole idea behind Postman is to test out endpoints are working correctly.
 */
public class CalcApplication { // http://localhost:8080

	public static void main(String[] args) { //what server host name should we use for the post request?  
		//Javalin app = Javalin.create();
		Javalin app = Javalin.create(config -> {
			//This namely hosts the static html file on the server (Postman Server)
			config.addStaticFiles("/", Location.CLASSPATH);
		});
		
		ArithmeticController ctrl = new ArithmeticController(new ArithmeticService());
		//ArithmeticController ctrl = new ArithmeticController();
		ctrl.registerEndpoint(app);
		
		app.start(8080);
	}
}

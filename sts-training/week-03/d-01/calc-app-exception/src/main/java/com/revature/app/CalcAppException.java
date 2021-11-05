package com.revature.app;

import com.revature.controller.ControllerException;
import com.revature.service.ServiceException;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

/*
 * 1. Run this file As -> Java Application
 * 2. Run file:///C:/Users/dee/Documents/wskp-wk3/calc-app-exception/src/main/resources/index.html
 */
public class CalcAppException {
	public static void main(String[] args) {  
		//Javalin app = Javalin.create();
		Javalin app = Javalin.create(config -> {
			//This hosts the static html file on the server
			config.addStaticFiles("/", Location.CLASSPATH);
		});
		
		ControllerException ctrl = new ControllerException(new ServiceException());
		ctrl.registerEndpoint(app);
		
		app.start(8080);
	}
}

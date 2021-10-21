package com.revature.app;

import com.revature.model.Reimbursement;

// Packages follow a "reverse domain" naming convention
// If you work for google, you package name will usually start with com.google.<whatever you want>.<even more>

public class Main {
	
	// Activate intelliSense with "ctrl + space"
	// the main method is application entry point
	public static void main(String[] args) {
		Reimbursement reim = new Reimbursement();
		
		println("Hi there!");
		println(reim.approved);
		println(reim.submitter);
		println(reim.description);
	}
	
	/**
	 * The method signature is println(String)
	 * MAVEN is a project manager tool like npm
	 * 
	 * @param message - the string to be displayed to the end-user
	 */
	static void println(String message) {
		// sysout followed by "ctrl + space" 
		System.out.println(message);
	} 
	
	static void println(boolean bool) {
		System.out.println(bool);
	}
}

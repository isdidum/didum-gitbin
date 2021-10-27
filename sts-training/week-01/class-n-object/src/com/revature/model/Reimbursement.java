package com.revature.model;

//A class is intended to function as a blueprint for the various objects
// An object is a "real-world" instance that has various properties and behaviors defined in the blueprint

// Classes are used to actually create an object of that particular type
public class Reimbursement {
	//this is the person who submitted the reimbursement
	public String submitter = "Didum";	 
	
	// This is a descriptor for the particular reimbursement
	public String description = "This is a reimbursement for travel expense"; 	
	
	// if this Reimbursement is approved, then the value of this property should be true, and false if it is pending or denied
	public boolean approved = true;
	
	public double amount = 100.58;
}

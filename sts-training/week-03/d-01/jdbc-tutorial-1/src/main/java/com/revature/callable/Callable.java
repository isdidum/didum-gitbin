package com.revature.callable;

public class Callable {
	/**
	 * Print: default constructor
	 * @notes <p> <code>1. public class SystemOut{}</code> is equivalent to:<br />
	 * <code>2. public class SystemOut extends Object{}</code> <br />Object is the the root of all class, hence,
	 * case 2. is always the default if no "extends Object" is used.</p>
	 */
	public Callable() {
		//no initialization needed
	}
	
	/**
	 * print(): facilitator - prints line
	 * @notes print() accepts variable length arguments - takes one or more string parameters 
	 * @param sArgs - of type string
	 */
	public void print(Object...object) {
		try {
			for(Object obj: object){
				System.out.print(obj);
			}
		}catch(Exception err) {
			err.printStackTrace();
		}
	}
	
	/**
	 * println(): facilitator - prints new line
	 * @param oObject - of type oObj
	 */
	public void println(Object...oObject) {
		try {
			for(Object obj:oObject){
				System.out.println(obj);
			}
		}catch(Exception err) {
			err.printStackTrace();
		}
	}
	
	/**
	 * debug(): facilitator - debug line
	 * @notes debug() accepts variable length arguments -  one of more string parameters is needed
	 * @param string[] - of type string array
	 */
	public void debug(Object...object) {
		try {
			for(Object obj:object){
				System.err.println(obj);
			}
		}catch(Exception err) {
			err.printStackTrace();
		}
	}
	
	/**
	 * printf(): facilitator - prints and formats line
	 * @param strings - of type string
	 * @param objects - of type double
	 */
	public void printf(final String strings, final Object...objects){
		try {
			//System.out.printf("Total cost = $%1.2f%n", arg);
			System.out.printf(strings, objects); //printf/format are similar
		}catch(Exception err) {
			err.printStackTrace();
		}
	}
}

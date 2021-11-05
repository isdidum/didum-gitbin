package com.didum.callable;

public class CallableUtil {
	/*
	 * All methods here are non-static
	 */
	public CallableUtil(){}
	
	/**
	 * println(): Facilitator prints a new line (this is a static method)
	 * 
	 * @implNote To use, call CallableUtils.println(...)
	 * @param strings - accepts variable arguments (var-args) as parameter
	 */
	public void println(Object...strings) {
		try {
			for(Object obj : strings) {
				System.out.println(obj);
			}
		} catch(Exception err) {
			err.printStackTrace();
		}
	}
	
	/**
	 * print(): facilitator prints a line continuation (this is a static method)
	 * 
	 * @implNote To use, call CallableUtils.print(...)
	 * @param strings - accepts variable arguments (var-args) as parameter
	 */
	public void print(Object...strings) {
		try {
			for(Object obj : strings) {
				System.out.print(obj);
			}
		} catch (Exception err) {
			err.printStackTrace();
		}
	}
	
	/**
	 * debug(): debug lines (this is a static method)
	 * 
	 * @implNote To use, call CallableUtils.debug(...)
	 * @param object - variable arguments length as parameter
	 */
	public void debug(Object...object) {
		try {
			for(Object obj: object) {
				System.err.println(obj);
			}
		} catch(Exception err) {
			err.printStackTrace();
		}
	}
	
	/**
	 * printf(): prints and formats a line 
	 * @param strings - of type string
	 * @param objects - of type object (var-args parameter)
	 */
	public void printf(final String strings, final Object...objects) {
		try {
			//System.out.printf("Total cost = $%1.2f%n", objects);
			System.out.printf(strings, objects);
		}catch(Exception err) {
			err.printStackTrace();
		}
	}
}

package com.revature.app;

public class BuilderBufferApp {

	public static void main(String[] args) {
		
		long beginTime;
		long endTime;
		
		beginTime = System.nanoTime();
		System.out.println( reverseStringConcat("hello world") );
		endTime = System.nanoTime();
		System.out.println("ReverseStringConcat took "+(endTime-beginTime)+" nm");
		
		beginTime = System.nanoTime();
		System.out.println( reverseStringBuilder("hello world") );
		endTime = System.nanoTime();
		System.out.println("ReverseStringBuilder took "+(endTime-beginTime)+" nm");
		
		beginTime = System.nanoTime();
		System.out.println( reverseStringBuffer("hello world") );
		endTime = System.nanoTime();
		System.out.println("ReverseStringBuffer took "+(endTime-beginTime)+" nm");
	}
	
	/*
	 * String concatenation, is a lot slower than using StringBuilder
	 */
	public static String reverseStringConcat(String s) {
		String str = "";
		for(int i = s.length()-1; i >= 0; i--) {
			char c = s.charAt(i);
			str = str + c;
		}
		return str;
	}
	
	/*
	 * StringBuilder is mutable
	 * additional characters are appended to this object to have much faster performace
	 */
	public static String reverseStringBuilder(String s) {
		StringBuilder str = new StringBuilder();
		
		for(int i = s.length()-1; i >= 0; i--) {
			char c = s.charAt(i);
			str.append(c);
		}
		
		String st = str.toString();
		return st;
	}

	/*
	 * StringBuffer is mutable
	 * additional characters are appended to this object to have much faster performace
	 */
	public static String reverseStringBuffer(String s) {
		StringBuffer str = new StringBuffer();
		
		for(int i = s.length()-1; i >= 0; i--) {
			char c = s.charAt(i);
			str.append(c);
		}
		
		String st = str.toString();
		return st;
	}
}


package com.revature.pretraining;

import com.didum.callable.CallableUtils;
import com.didum.callable.CallableUtil;

//Java is a high-level, compiled, strongly-typed, object-oriented programming language
//High-level: Code that is easily humand readable
//Compiled: Human-readable code (source code) is compiled, or transformed, into low-level code that is 
// 	more optimized for computers to run
//		In the case of Java, source code is compiled into bytecode
//		The JVM executes the bytecode
//Strongly-typed: variable declared of a certain type can only have values assigned to it of that same type.
//		The type cannot change of that variable (static type)
//Object-Oriented: Java revolves around the usage of objects. Classes act as blueprints for object.
//		Objects are constructed from their blueprints (classes)
//Benefits of Java:
//platform independent (write one, run anywhere, anytime)
//		is C-language inspired syntax
//		has automatic memory management (Garbage Collector)
//JDK - Java Development Kit: contains a compiler, debugger, in addition to a JRE
//		
//JRE - Java Runtime Environment: Contains the runtime libraries that our code may be using including the JVM
//		If a program has already been compiled, all you need is to install a JRE to run it
//		JRE primarily runs Java programs
//JVM - Java Virtual Machine: Enables a computer to actually executed a Java program
//		JVM is what runs the bytecode (compiled) and the translate it so that the machine can understand the bytecode.

//to write a run a java program, install a jdk
//to run java program, install a jre

//Java Naming Conventions
//Classes: should be nouns with first letter of each word capitalized
//Methods: verbs, mixed case with the first letter lowercase, and every subsequent words first-letter capitalized
//Project-Names: snake case (all lowercase with hyphen between words)
public class HelloWorldRev { //HelloWorldRev.class is a byte code
	//ctrl + space shows intellisense in eclipse
	public static void main(String[] args) {
		
		//in order to use CallableUtil object in HelloWorldRev.java, do the following:
		// right-click hello-world project --> properties --> Java Build Path --> Click Project Tab --> Click Classpath --> click add --> select didum-callable-utility
		// this allows you to import the packages above
		CallableUtil cu = new CallableUtil();
		
		out("Hello, World of Revature!"); //this is static call
		println("To run this file in CMD, do the following:"); //all the ones with 'cu.' are instance invocation
		cu.println("1. First download your Java JDK subject to your OS-version from www.oracle.com");
		cu.println("2. Open command line-prompt, then verify Java Version, by typing: A. java -version B. javac -version");
		cu.println("2.5 Both A and B from step must match.");
		cu.println("3. Next, navigate to the directory where this HelloWorld.java resides");
		cu.println("4. Type: javac HelloWorld.java");
		cu.println("5. Step 4 creates an executable file, named: HelloWorld.class");
		cu.println("6. Now, run the executable file by typing: java HelloWorld ... the dot-class extension is removed");
		
	}
	
	/**
	 * The method signature is println(String)
	 * 
	 * @param message - the string to be displayed to the end-user
	 */
	static void println(String message) {
		System.out.println(message);
	}
	
	/**
	 * out(): This method accepts var-args length as parameter
	 * The method signature is out(..., ..., ...)
	 */
	static void out(Object...obj) {
		CallableUtils.println(obj);
	}
}

package com.revature.service;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/*
 * To run MathServiceTutorial
 * 1. Right-click -> Run As -> 1 Junit Test
 * 2. Classes are also used when writing test
 */
public class MathServiceTutorial {
	/*
	 * There are 5-annotations to be aware of:
	 * 1. @BeforeAll:  must be annotated to a static method 
	 * 2. @BeforeEach: non-static
	 * 3. @Test: non-static
	 * 4. @AfterEach: non-static
	 * 5. @AfterAll: must be annotated to a static method
	 */
	
	//BeforeAll and BeforeEach can be used to setup initial objects for out tests
	//AfterAll and AfterEach might be used to cleanup resources whtat we have used
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Run before-all of our tests");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Run before-each and every test");
	}
	
	@AfterEach
	public void AfterEach() {
		System.out.println("Run after-each and every test");
	}
	
	@AfterAll
	public static void AfterAll() {
		System.out.println("Run after-all of our tests");
	}
	
	@Test
	public void test1() {
		System.out.println("Run test1");
	}
	
	@Test
	public void test2() {
		System.out.println("Run test2");
	}
	
	@Test
	public void test3() {
		System.out.println("Run test3");
	}
}

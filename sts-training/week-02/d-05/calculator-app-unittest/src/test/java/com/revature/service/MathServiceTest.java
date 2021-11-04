package com.revature.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Order;

/*
 * Unit-Test is demonstrated in this class
 * 1. When inputs are 10.5 & 100.34, then our output should be return 0
 * 2. When left-input is blank (" ") & right-input is 10.53, then our output should return 1
 * 3. When left-input is 10.3 & right-input is blank (" "), then our output should return 2
 * 4. When both left & right inputs are blanks (" "), then out output should return 3
 */

/*
 * Test Driven Development (TDD):
 * - Designing your actual application around the tests
 * - Take your requirements -> writes test -> then write the application to pass those tests
 * - It is the opposite of what we did here (we wrote our code first, before writing the tests)
 * 
 * Pros:
 * - always have tests for your methods (code coverage)
 *     - Code Coverage: what percent of your code is actually associated with these tests?
 * - if done correctly, could result in less bugs
 * - encourages good design and architecture
 * 
 * Cons:
 * - Hard to do for inexperience developer
 * - Can slow down developer b/c you have to start-out with testing
 */

/*
 * Positive vs. Negative Testing
 * Positive test: A condition where the user is utilizing something correctly
 * Negative test: A condition where the user is utilizing something incorrectly
 */

/*
 * Ordering Test: by default, tests inside of a class will run in a random order.
 * There is no guaranteed order of the tests.
 * 
 * To specify order
 * 1. Put the @TestMethodOrder(OrderAnnotation.class) annotation on top of the test class
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MathServiceTest { //@TestMethodOrder(OrderAnnotation.class)
	
	public MathService mathService;
	
	@BeforeEach
	public void setup() {
		this.mathService = new MathService();
	}
	
	@Test //left-&-right-non-blank-inputs
	@Order(1)
	public void testMethodWithNoBlankInputs() {
		/*
		 * Arrange:
		 * arrange happens to be in the beforeEach method, where MathService object is created
		 * Initial values are being arranged
		 */
		
		/*
		 * Act:
		 * acting on what we want to test. Invoking the inspectInputs method
		 */
		int result = this.mathService.inspectInputs("10.5", "100.34");
		
		/*
		 * Assert
		 * ensure assertion gives correct output. The output should be zero if the logic is correct. 
		 */
		Assertions.assertEquals(0,result);
		
		// JUnit 5 common assert methods
		// assertArrayEquals(int[] expected, int[] actual)
		// assertEquals(int expected, int actual)
		// assertTrue(boolean actual)
		// assertFalse(boolean actual)
		// fail(): automatically fails the test
		
		/*
		 * Test Case vs. Test Suite
		 * Test Case:
		 *  - a test method annotated with @Test
		 *  
		 * Test Suite:
		 *  - a collection of test classes (contain test methods)
		 *  - a test suite is a comprehensive suite of tests
		 */
	}
	
	@Test //left-input-blank-&-non-blank-right-input
	@Order(2)
	public void testWithLeftBlankAndNonBlankRight() {
		/*
		 * Arrange:
		 * arrange happens to be in the beforeEach method, where MathService object is created
		 * Initial values are being arranged
		 */
		
		/*
		 * Act:
		 * acting on what we want to test. Invoking the inspectInputs method
		 */
		int result = this.mathService.inspectInputs("   ", "10.53");
		
		/*
		 * Assert
		 * ensure assertion gives correct output. The output should be zero if the logic is correct. 
		 */
		Assertions.assertEquals(1,result);
	}
	
	@Test //non-blank-left-input-&-blank-right-input
	@Order(3)
	public void testnonBlankLeftAndBlankRight() {
		/*
		 * Arrange:
		 * arrange happens to be in the beforeEach method, where MathService object is created
		 * Initial values are being arranged
		 */
		
		/*
		 * Act:
		 * acting on what we want to test. Invoking the inspectInputs method
		 */
		int result = this.mathService.inspectInputs("10.3", "   ");
		
		/*
		 * Assert
		 * ensure assertion gives correct output. The output should be zero if the logic is correct. 
		 */
		Assertions.assertEquals(2,result);
	}
	
	@Test //both-left-and-right-input-blank
	@Order(4)
	public void testBothLeftAndRightBlank() {
		/*
		 * Arrange:
		 * arrange happens to be in the beforeEach method, where MathService object is created
		 * Initial values are being arranged
		 */
		
		/*
		 * Act:
		 * acting on what we want to test. Invoking the inspectInputs method
		 */
		int result = this.mathService.inspectInputs("   ", "   ");
		
		/*
		 * Assert
		 * ensure assertion gives correct output. The output should be zero if the logic is correct. 
		 */
		Assertions.assertEquals(3,result);
	}
}

package com.revature.MavenDemo;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringAdderTest {

	private static StringAdder sa;

	/*
	 * TDD: red- green refactoring: start with requirement, write test, build code
	 * to match
	 * 
	 * String Adder: compute Double values from comma-seperated string
	 * 
	 * 1. calling add("") returns Double value of 0 
	 * 2. calling add() with two comma-separated values returns sum of those values 
	 * 3. calling add() with null returns 0 
	 * 4. calling add() with > 2 arguments throws a CalculatorException
	 * 5. calling add() with incorrect characters throws a CalculatorException
	 */

	@Rule
	public ExpectedException thrown = ExpectedException.none(); // if any exception is thrown, the test will fails

	@BeforeClass
	public static void initializeStringAdder() {
		sa = new StringAdder();
	}

	@Test
	public void emptyStringReturnsZero() throws Exception {
		assertEquals(0, sa.add(""), .0001); // floating-point assertions require an offset
	}

	@Test
	public void nullReturnsZero() throws Exception {
		assertEquals(0, sa.add(null), .0001);
	}

	@Test
	public void moreThanTwoThrowsException() throws Exception {
		thrown.expect(Exception.class);
		sa.add("1,2,3");
	}

	@Test
	public void twoNumbersReturnsSum() throws Exception {
		assertEquals(44.0, sa.add("22.0,22.0"), .0001);
	}

}

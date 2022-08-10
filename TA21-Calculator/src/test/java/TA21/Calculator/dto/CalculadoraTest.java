package TA21.Calculator.dto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	Operations operations = new Operations();
	
	/**
	 * *feature*: (sobre la qual fem @Test): "plus" de la classe "Operations"
	 * *given*: classe Operations
	 */
	@Test
	void testPlus() {
		String num1 = "2";
		String num2 = "2";
		
		
		Double resultExpected = 4.0;
		Double resultCalculated = operations.plus(num1, num2);
		assertEquals(resultExpected, resultCalculated);
	}
	
	
	/**
	 * *feature*: (sobre la qual fem @Test): "power2" de la classe "Operations"
	 * *given*: classe Operations
	 */
	@Test
	void testPower2() {
		String num1 = "2";
		
		
		Double resultExpected = 4.0;
		Double resultCalculated = operations.power2(num1);
		assertEquals(resultExpected, resultCalculated);
	}
	
	/**
	 * *feature*: (sobre la qual fem @Test): "sqrt" de la classe "Operations"
	 * *given*: classe Operations
	 */
	@Test
	void testSqrt() {
		String num1 = "4";
		
		
		Double resultExpected = 2.0;
		Double resultCalculated = operations.sqrt(num1);
		assertEquals(resultExpected, resultCalculated);
	}
	
	/**
	 * *feature*: (sobre la qual fem @Test): "divide" de la classe "Operations"
	 * *given*: classe Operations
	 */
	@Test
	void testDivide() {
		String num1 = "4";
		String num2 = "2";
		
		
		Double resultExpected = 2.0;
		Double resultCalculated = operations.divide(num1, num2);
		assertEquals(resultExpected, resultCalculated);
	}
	
	/**
	 * *feature*: (sobre la qual fem @Test): "signChange" de la classe "Operations"
	 * *given*: classe Operations
	 */
	@Test
	void testSignChange() {
		String num1 = "-200";
		
		// Con signo negativo
		String resultExpected = "200";
		String resultCalculated = operations.signChange(num1);
		assertEquals(resultExpected, resultCalculated);
		
		// Sin signo
		num1 = "-100.0";
		resultExpected = "100.0";
		resultCalculated = operations.signChange(num1);
		assertEquals(resultExpected, resultCalculated);
	}
}
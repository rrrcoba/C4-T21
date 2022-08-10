package TA21.Calculator.dto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	/**
	 * *feature*: (sobre la qual fem @Test): "plus" de la classe "Operations"
	 * *given*: classe Operations
	 */
	@Test
	void testAreaCuadrado() {
		Operations operations = new Operations();
		String num1 = "2";
		String num2 = "2";
		
		
		Double resultExpected = 4.0;
		Double resultCalculated = operations.plus(num1, num2);
		assertEquals(resultExpected, resultCalculated);
	}

}

package TA21.Calculator.dto;

public class Operations {

	/**
	 * Constructor en blanco
	 */
	public Operations() {

	}

	/**
	 * Sumar
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public Double plus(String num1, String num2) {
		double n1 = Double.parseDouble(num1);
		double n2 = Double.parseDouble(num2);

		double result = n1 + n2;

		return result;
	}
}
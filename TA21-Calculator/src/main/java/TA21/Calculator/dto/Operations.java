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
	 * @return resultado
	 */
	public Double plus(String num1, String num2) {
		double n1 = Double.parseDouble(num1);
		double n2 = Double.parseDouble(num2);

		double result = n1 + n2;

		return result;
	}
	
	/**
	 * Restar
	 * 
	 * @param num1
	 * @param num2
	 * @return resultado
	 */
	public Double minus(String num1, String num2) {
		double n1 = Double.parseDouble(num1);
		double n2 = Double.parseDouble(num2);

		double result = n1 - n2;

		return result;
	}
	
	/**
	 * Multiplicar
	 * 
	 * @param num1
	 * @param num2
	 * @return resultado
	 */
	public Double multiply(String num1, String num2) {
		double n1 = Double.parseDouble(num1);
		double n2 = Double.parseDouble(num2);

		double result = n1 * n2;

		return result;
	}
	
	/**
	 * Invertir
	 * 
	 * @param num2
	 * @return resultado
	 */
	public Double oneDivide( String num2) {
		double n1 = 1.0;
		double n2 = Double.parseDouble(num2);

		double result = n1 / n2;

		return result;
	}
	
	/**
	 * Porcentaje
	 * 
	 * @param num1
	 * @param num2
	 * @return resultado
	 */
	public Double percent(String num1,String num2) {
		double n1 = Double.parseDouble(num1);
		double n2 = Double.parseDouble(num2);

		double result = (n1 * n2)/100;

		return result;
	}
	
	/**
	 * Elevar al cuadrado
	 * 
	 * @param num1
	 * @return resultado
	 */
	public Double power2(String num1) {
		double n1 = Double.parseDouble(num1);
		
		double result = n1*n1;
		
		return result;
	}
	
	/**
	 * Raíz cuadrada
	 * 
	 * @param num1
	 * @return resultado
	 */
	public Double sqrt(String num1) {
		double n1 = Double.parseDouble(num1);
		
		double result = Math.sqrt(n1);
		
		return result;
	}
	
	/**
	 * Dividir
	 * 
	 * @param num1
	 * @param num2
	 * @return resultado
	 */
	public Double divide(String num1, String num2) {
		double n1 = Double.parseDouble(num1);
		double n2 = Double.parseDouble(num2);
		
		double result = n1 / n2;
		
		return result;
	}
	
	/**
	 * Cambia el signo
	 * 
	 * @param num1
	 * @return resultado
	 */
	public String signChange(String num1) {
		StringBuffer sb = new StringBuffer();
		String result;
		
		// Si empieza por negativo se lo quitamos
		if (num1.startsWith("-")) {
			result = num1.substring(1);
			
		// Sino, le insertamos un negativo al principio
		} else {
			sb.append("-");
			sb.append(num1);
			result = sb.toString();
		}
		
		return result;
	}
}
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;


class GeometriaTest {

	/**
     * *feature*: (sobre la qual fem @Test): areaCuadrado de la classe Geometria
     * *given*: --
     * *scenario*:
     * - S'intenta calcular l'area multiplicant per si mateix el valor introduït a l'argument
     */
	@Test
	void testAreaCuadrado() {
		
		// El codi 1 es per a les figures "cuadrado"
		Geometria g = new Geometria(1);
		
		int resultExpected = 4;
    	int resultCalculated = g.areacuadrado(2);
    	assertEquals(resultExpected, resultCalculated);
	}
}
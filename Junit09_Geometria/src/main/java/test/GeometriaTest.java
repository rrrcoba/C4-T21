package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;


class GeometriaTest {

	/**
     * *feature*: (sobre la qual fem @Test): "areacuadrado" de la classe "Geometria"
     * *given*: classe Geometria amb el codi de figura 1 per al cuadrat
     * *scenario*:
     * - S'intenta calcular l'area multiplicant per si mateix el valor introduït a l'argument
     */
	@Test
	void testAreaCuadrado() {
		Geometria g = new Geometria(1);
		
		int resultExpected = 4;
    	int resultCalculated = g.areacuadrado(2);
    	assertEquals(resultExpected, resultCalculated);
    	assertEquals("cuadrado", g.getNom());
	}
	
	/**
     * *feature*: (sobre la qual fem @Test): "areaCirculo" de la classe "Geometria"
     * *given*: classe Geometria amb el codi de figura 2 per al cercle
     * *scenario*:
     * - S'intenta calcular l'area multiplicant PI per el valor de l'argument al cuadrat
     */
	@Test
	void testAreaCirculo() {
		Geometria g = new Geometria(2);
		
		double resultExpected = (Math.PI*(2*2));
    	double resultCalculated = g.areaCirculo(2);
    	assertEquals(resultExpected, resultCalculated, 0.0001);
    	assertEquals("Circulo", g.getNom());
	}
	
	/**
     * *feature*: (sobre la qual fem @Test): "areatriangulo" de la classe "Geometria"
     * *given*: classe Geometria amb el codi de figura 3 per al triangle
     * *scenario*:
     * - S'intenta calcular l'area multiplicant el primer valor per el segon valor i dividint per 2
     */
	@Test
	void testAreaTriangulo() {
		Geometria g = new Geometria(3);
		
		int resultExpected = ((2*2)/2);
    	int resultCalculated = g.areatriangulo(2, 2);
    	assertEquals(resultExpected, resultCalculated);
    	assertEquals("Triangulo", g.getNom());
	}
	
	/**
     * *feature*: (sobre la qual fem @Test): "arearectangulo" de la classe "Geometria"
     * *given*: classe Geometria amb el codi de figura 4 per al rectangle
     * *scenario*:
     * - S'intenta calcular l'area multiplicant el primer valor per el segon valor
     */
	@Test
	void testAreaRectangulo() {
		Geometria g = new Geometria(4);
		
		int resultExpected = (2*3);
    	int resultCalculated = g.arearectangulo(2, 3);
    	assertEquals(resultExpected, resultCalculated);
    	assertEquals("Rectangulo", g.getNom());
	}
	
	/**
     * *feature*: (sobre la qual fem @Test): "areapentagono" de la classe "Geometria"
     * *given*: classe Geometria amb el codi de figura 5 per al pentagon
     * *scenario*:
     * - S'intenta calcular l'area multiplicant el primer valor per el segon valor i dividint per 2
     * (perímetre per apotema partit per 2)
     */
	@Test
	void testAreaPentagono() {
		Geometria g = new Geometria(5);
		
		int resultExpected = ((20*4)/2);
    	int resultCalculated = g.areapentagono(20, 4);
    	assertEquals(resultExpected, resultCalculated);
    	assertEquals("Pentagono", g.getNom());
	}
}
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

	/**
	 * *feature*: (sobre la qual fem @Test): "arearombo" de la classe "Geometria"
	 * *given*: classe Geometria amb el codi de figura 6 per al rombo
	 * *scenario*:
	 * - S'intenta calcular l'area multiplicant el primer valor per el segon valor i dividint per 2
	 * (multiplicar les dues diagonals i partit per 2)
	 */
	@Test
	void testAreaRombo() {
		Geometria g = new Geometria(6);

		int resultExpected = ((10*6)/2);
		int resultCalculated = g.arearombo(10, 6);
		assertEquals(resultExpected, resultCalculated);
		assertEquals("Rombo", g.getNom());
	}

	/**
	 * *feature*: (sobre la qual fem @Test): "arearomboide" de la classe "Geometria"
	 * *given*: classe Geometria amb el codi de figura 7 per al romboide
	 * *scenario*:
	 * - S'intenta calcular l'area multiplicant el primer valor per el segon valor
	 */
	@Test
	void testAreaRomboide() {
		Geometria g = new Geometria(7);

		int resultExpected = (10*5);
		int resultCalculated = g.arearomboide(10, 5);
		assertEquals(resultExpected, resultCalculated);
		assertEquals("Romboide", g.getNom());
	}

	/**
	 * *feature*: (sobre la qual fem @Test): "areatrapecio" de la classe "Geometria"
	 * *given*: classe Geometria amb el codi de figura 8 per al trapezi
	 * *scenario*:
	 * - S'intenta calcular l'area sumant la base i el sostre i dividint per 2 i multiplicant per l'altura
	 */
	@Test
	void testAreaTrapecio() {
		Geometria g = new Geometria(8);

		int resultExpected = ((10+8)/2)*5;
		int resultCalculated = g.areatrapecio(10, 8, 5);
		assertEquals(resultExpected, resultCalculated);
		assertEquals("Trapecio", g.getNom());
	}

	/**
	 * *feature*: (sobre la qual fem @Test): "toString" de la classe "Geometria"
	 * *given*: classe Geometria amb el codi de figura 8 per al trapezi
	 * *scenario*:
	 * - Es calcula l'area del trapezi
	 * - Es guarda a l'atribut area de la classe utilitzant el metode pertinent
	 * - S'utilitza el métode toString per generar una sortida string amb les dades
	 */
	@Test
	void testToString() {
		Geometria g = new Geometria(9);

		int area = g.areatrapecio(10, 8, 5);
		g.setArea((double)area);
		String toStringReturn = g.toString();
		assertEquals("Geometria [id=9, nom=Default, area=45.0]", toStringReturn);
	}

	/**
	 * *feature*: (sobre la qual fem @Test): "setId", "getId", "setArea", "getArea" i el constructor per defecte
	 *  de la classe "Geometria"
	 * *given*: --
	 * *scenario*:
	 * - S'utilitza el constructor per defecte
	 * - Es calcula l'àrea d'un quadrat i s'introdueix a la classe
	 * - Es canvia la id a la id d'un quadrat
	 * - Es canvia el nom al nom "cuadrado"
	 */
	@Test
	void testConstructorsSettersGetters() {
		Geometria g = new Geometria();
		assertEquals(9, g.getId());
		assertEquals("Default", g.getNom());

		int area = g.areacuadrado(2);
		g.setArea(area);
		assertEquals(4, g.getArea());

		g.setId(1);
		assertEquals(1, g.getId());

		g.setNom("cuadrado");
		assertEquals("cuadrado", g.getNom());
	}
}
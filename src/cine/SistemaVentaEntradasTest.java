package cine;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaVentaEntradasTest {

	static SistemaVentaEntradas sist;

	@BeforeAll
	static void crearInstanciaSist() {

		System.out.println("ANTES DE TODOS LOS TEST");
		sist = new SistemaVentaEntradas();
	}

	@BeforeEach
	void limpiarCine() {
		sist.vaciarCine();
	}

	@Test
	void testAnyadirSala() {

		assertTrue(sist.anyadirSala(1, "Matrix"));
		Sala sala1 = new Sala(1, null);
		assertTrue(sist.getSalas().contains(sala1));
	}

	@Test
	void testAnyadirSalaRepetida() {

		sist.anyadirSala(1, "Matrix");
		assertFalse(sist.anyadirSala(1, "Matrix"));
		assertEquals(1, sist.getSalas().size());

	}

	@Test
	void testAnyadirSalaMaximoSalas() {

		sist.anyadirSala(1, "Matrix");
		sist.anyadirSala(2, "Ready Player One");
		sist.anyadirSala(3, "One Piece");
		sist.anyadirSala(4, "Sonic");
		sist.anyadirSala(5, "Torrente");
		assertFalse(sist.anyadirSala(6, "Lo que el viento se llevó"));
		assertEquals(5, sist.getSalas().size());

	}

	@Test
	void testComprarEntrada2() {
		sist.anyadirSala(1, "Titanic");

//		Comprobar comprar entrada ok
		assertTrue(sist.comprarEntrada(1, 5));

//		Comprobar comprar entrada false sala inexistente
		assertFalse(sist.comprarEntrada(2, 10));

//		Comprobar comprar entrada false butaca fuera de rango
		assertFalse(sist.comprarEntrada(1, 35));
		assertFalse(sist.comprarEntrada(1, 0));
//
//		Entrada entrada1 = new Entrada(1, 5, 12);
//		sist.getEntradas().add(entrada1);
//		assertTrue(sist.getEntradas().contains(entrada1));
	}

	@Test
	void testComprarEntradaPrecios() {
		double resultado = sist.calcularPrecioEntrada(3);
		assertEquals(10, resultado);

	}

//	@Test
//	void testAnyadirSala() {
//
//	}

//
//	@Test
//	void testGetEntradasVendidasPorSala() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testTotalRecaudacion() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testCalcularPrecioEntrada() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testVaciarCine() {
//		fail("Not yet implemented");
//	}

}

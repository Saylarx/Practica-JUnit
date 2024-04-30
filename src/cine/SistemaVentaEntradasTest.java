package cine;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SistemaVentaEntradasTest {

	static SistemaVentaEntradas sist;

	@BeforeAll
	static void crearInstanciaCalc() {

		System.out.println("ANTES DE TODOS LOS TEST");
		sist = new SistemaVentaEntradas();
	}

	@BeforeEach
	void limpiarCine() {
		sist.vaciarCine();
	}

//	@Test
//	void testAnyadirSalaOk() {
//
//		assertTrue(sist.anyadirSala(1, "Matrix"));
//		Sala sala1 = new Sala(1, "Matrix");
//		sist.getSalas().add(sala1);
//		assertTrue(sist.getSalas().contains(sala1));
//
//	}
	
	@Test
	void testAnyadirSalaOk() {
	    assertTrue(sist.anyadirSala(1, "Matrix"));
	    assertTrue(sist.getSalas().stream().anyMatch(sala -> sala.getNumSala() == 1 && sala.getPelicula().equals("Matrix")));
	}


	@Test
	void testAnyadirSalaOk() {

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

//	@Test
//	void testAnyadirSala() {
//
//	}

//	@Test
//	void testComprarEntrada() {
//		fail("Not yet implemented");
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

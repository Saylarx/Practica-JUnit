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

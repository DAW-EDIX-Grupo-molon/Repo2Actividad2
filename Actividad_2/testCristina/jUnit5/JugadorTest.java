package jUnit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cristina.Jugador;

class JugadorTest {

	@Test
	void testPonerDorsalCorrecto() {
		System.out.println("Test PonerDorsal Correcto");
		// GIVEN -- Dado...
		Jugador jugador = new Jugador();
		int dorsal = 5;
		
		// WHEN -- Cuando... cambio de estado
		jugador.ponerDorsal(dorsal);
		
		// THEN -- Entonces ...
		assertEquals(dorsal, jugador.getDorsal());
	}
	
	@Test
	void testPonerDorsalIncorrecto() {
		System.out.println("Test PonerDorsal Incorrecto");
		// GIVEN -- Dado...
		Jugador jugador = new Jugador();
		int dorsal = 31;
		
		// WHEN -- Cuando... cambio de estado
		jugador.ponerDorsal(dorsal);
		
		// THEN -- Entonces ...
		assertEquals(-1, jugador.getDorsal());
	}
	
	@Test
	void testConTarjetasAmarillas() {
		System.out.println("Test 2 tarjetas amarillas");
		// GIVEN -- Dado...
		Jugador jugador = new Jugador();

		// WHEN -- Cuando... cambio de estado
		jugador.setNumeroTarjetasAmarillas(2);
		
		// THEN -- Entonces ...
		assertTrue(jugador.estaExpulsado());
	}
	
	@Test
	void testConTarjetaRoja() {
		System.out.println("Test 1 tarjetas roja");
		// GIVEN -- Dado...
		Jugador jugador = new Jugador();

		// WHEN -- Cuando... cambio de estado
		jugador.setNumeroTarjetasRojas(1);
		
		// THEN -- Entonces ...
		assertTrue(jugador.estaExpulsado());
	}
	
	@Test
	void testSinTarjetas() {
		System.out.println("Test 1 tarjetas roja");
		// GIVEN -- Dado...
		Jugador jugador = new Jugador();

		// WHEN -- Cuando... cambio de estado
		jugador.setNumeroTarjetasRojas(0);
		jugador.setNumeroTarjetasAmarillas(1);
		
		// THEN -- Entonces ...
		assertFalse(jugador.estaExpulsado());
	}
}

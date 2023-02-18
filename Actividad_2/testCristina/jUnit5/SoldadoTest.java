package jUnit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cristina.Soldado;

class SoldadoTest {

	/**
	 * En este método probamos el método disparar de la clase soldado, instanciando
	 * un objeto de dicha clase y añadiendole un valor al número de balas.
	 */
	@Test
	void testDisparar() {
		System.out.println("Test el soldado dispara");

		// GIVEN -- Dado...
		Soldado soldado = new Soldado();
		Soldado soldadoObjetivo = new Soldado();
		int balasIniciales = 4;

		soldado.setNumeroBalas(balasIniciales);

		// WHEN -- Cuando... cambio de estado
		soldado.disparar(soldadoObjetivo);

		// THEN -- Entonces ...
		assertEquals(balasIniciales - 1, soldado.getNumeroBalas());
		assertTrue(soldadoObjetivo.isEstaMuerto());

	}

	/**
	 * En este método comprobamos el buen funcionamiento del método puedeDisparar,
	 * cuando devuelve TRUE, el decir teniendo balas. Para ello instanciando un
	 * objeto de dicha clase y añadiendole un valor al número de balas.
	 */
	@Test
	void testPuedeDisparar() {
		System.out.println("Test el soldado PUEDE dispara");

		// GIVEN -- Dado...
		Soldado soldado = new Soldado();

		// WHEN -- Cuando... cambio de estado
		soldado.setNumeroBalas(4);

		// THEN -- Entonces ...
		assertTrue(soldado.puedeDisparar());
	}

	/**
	 * En este método comprobamos el buen funcionamiento del método puedeDisparar,
	 * cuando devuelve FALSE, es decir cuando no tiene balas. Para ello instanciando
	 * un objeto de dicha clase y añadiendole un valor = 0 al número de balas.
	 */
	@Test
	void testNoPuedeDisparar() {
		System.out.println("Test el soldado NO PUEDE dispara");

		// GIVEN -- Dado...
		Soldado soldado = new Soldado();

		// WHEN -- Cuando... cambio de estado
		soldado.setNumeroBalas(0);

		// THEN -- Entonces ...
		assertFalse(soldado.puedeDisparar());
	}

}

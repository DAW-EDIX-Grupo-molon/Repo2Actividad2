package jUnit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cristina.Soldado;

class SoldadoTest {

	@Test
	void testDisparar() {
		System.out.println("Test el soldado dispara");
		
		// GIVEN -- Dado...
		Soldado soldado = new Soldado();
		Soldado soldadoObjetivo = new Soldado();
		
		soldado.setNumeroBalas(4);
		
		int balasRestantes = 4-1;

		// WHEN -- Cuando... cambio de estado
		soldado.disparar(soldadoObjetivo);
		
		// THEN -- Entonces ...
		assertEquals(balasRestantes, soldado.getNumeroBalas());
		assertTrue(soldadoObjetivo.isEstaMuerto());
	}
	
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

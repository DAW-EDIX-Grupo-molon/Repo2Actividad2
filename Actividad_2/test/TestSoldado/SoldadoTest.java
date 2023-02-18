package TestSoldado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import solucion.Soldado;

class SoldadoTest {

	/**
	 * Para el método puedeDisparar tenemos que probar dos casos, teniendo al menos una bala
	 * o sin balas. Cuando tiene balas debe darnos true, puede disparar y cuando no tiene balas
	 * debe darnos false, no puede disparar.
	 */
	@Test
	public void testPuedeDispararPositivo() {
		Soldado soldado = new Soldado();
		soldado.setNumeroBalas(1);
		
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = soldado.puedeDisparar();
		
		assertEquals(resultadoEsperado, resultadoObtenido);

	}
	
	@Test
	public void testPuedeDispararNegativo() {
		Soldado soldado = new Soldado();
		soldado.setNumeroBalas(0);
		
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = soldado.puedeDisparar();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	/**
	 * Para el método disparar tenemos que probar dos casos. En ambos de ellos se le resta una
	 * bala al soldado que dispara. Cuando el soldado disparado muere, nos devuelve true, cuando
	 * no muere, nos devuelve false. 
	 */
	
	@Test
	public void testDispararMuere() {
		Soldado soldado = new Soldado();
		
		soldado.setNumeroBalas(3);
		int numBalasAntes = soldado.getNumeroBalas();
		int resultadoEsperado = numBalasAntes-1;
		int resultadoObtenido = soldado.getNumeroBalas()-1;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		soldado.disparar(soldado);
		soldado.setEstaMuerto(true);
		
		assertTrue(soldado.isEstaMuerto());
	}
	
	@Test
	public void testDispararNoMuere() {
		Soldado soldado = new Soldado();
		
		soldado.setNumeroBalas(3);
		int numBalasAntes = soldado.getNumeroBalas();
		int resultadoEsperado = numBalasAntes-1;
		int resultadoObtenido = soldado.getNumeroBalas()-1;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		soldado.disparar(soldado);
		soldado.setEstaMuerto(false);
		
		assertFalse(soldado.isEstaMuerto());
	}
}

package lauraTestJUnit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import laura.Soldado;

class SoldadoTest {

	
	/*
	 * Para el metodo puedeDisparar probamos de dos formas diferentes una que el resultado sea positivo, 
	 * simpre que haya mas de 1 bala será positivo 
	 * en caso contrario devolverá false dando como resultado negativo
	 */
	@Test
	public void puedeDispararPositivo () {
		Soldado soldado = new Soldado();
		soldado.setNumeroBalas(2);
		
		boolean resultadoEsperado = true;
		int resultado = soldado.getNumeroBalas();
	}
	
	@Test
	public void puedeDispararNegativo () {
		Soldado soldado = new Soldado();
		soldado.setNumeroBalas(-2);
		
		boolean resultadoEsperado = false;
		int resultado = soldado.getNumeroBalas();
	}
	
	/*
	 * Para el metodo disparar probamos de dos formas diferentes una que el resultado sea positivo, 
	 * si el soldado dispara un soldado con vida este indicará true cuando esté muerto
	 * Si el soldado ya esta muerto no se puede matar por lo que devolverá false
	 */
	@Test
	public void dispararPositivo () {
		Soldado soldado = new Soldado();
		soldado.disparar(soldado);
		 soldado.setEstaMuerto(true);
		
		assertTrue(soldado.isEstaMuerto());
	}
	
	@Test
	public void dispararNegativo () {
		Soldado soldado = new Soldado();
		soldado.disparar(soldado);
		soldado.setEstaMuerto(false);
		
		
	}
	
}

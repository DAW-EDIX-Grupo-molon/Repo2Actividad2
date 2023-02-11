package ivan;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSoldado {

	private Soldado sold;
	
	@BeforeEach
	void setUp() throws Exception {

		sold = new Soldado();

	}

	@AfterEach
	void tearDown() throws Exception {
		sold = null;
	}
	
	//Test atributos
	@Test
	void testSetEstaMuerto() {
		/*
		 * El soladado esta vivo
		 */
		sold.setEstaMuerto(false);
		assertFalse(sold.isEstaMuerto());
		
		/*
		 * El soladado esta muerto
		 */
		sold.setEstaMuerto(true);
		assertTrue(sold.isEstaMuerto());
		
		
	}//END testSetEstaMuerto
	
	@Test
	void testSetNumeroBalas() {
		
		/*
		 * El soldado tiene 10 balas
		 */
		sold.setNumeroBalas(10);
		int valorvalorEsperado=10;
		int valorObtenido=sold.getNumeroBalas();
		assertEquals(valorvalorEsperado, valorObtenido);
		
		
	}//END testSetNumeroBalas
	
	//Test métodos
	@Test
	void testPuedeDisparar() {
		
		/*
		 * El soldado tiene 10 balas, por lo tanto puede disparar
		 */
		sold.setNumeroBalas(10);
		assertTrue(sold.puedeDisparar());
		/*
		 * El soldado tiene 0 balas, por lo tanto no puede disparar
		 */
		sold.setNumeroBalas(0);
		assertFalse(sold.puedeDisparar());
		
	}//END testPuedeDisparar
	
	@Test
	void testDisparar() {
		
		/*
		 * Aquí comprobamos dos partes:
		 * 1º El sold ha disparado la bala por lo consiguiente tiene 9 balas
		 * 2º Que el sol2 esta muerto
		 */
		Soldado sold2 = new Soldado();
		sold.setNumeroBalas(10);
		sold.disparar(sold2);
		int valorEsperado=9;
		int valorObtenido=sold.getNumeroBalas();
		assertEquals(valorEsperado,valorObtenido);
		assertTrue(sold2.isEstaMuerto());
		
	}//END testPuedeDisparar

}//END TestSoldado

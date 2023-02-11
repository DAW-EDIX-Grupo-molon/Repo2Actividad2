package ivan;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestJugador {

	private Jugador jug1;
	
	@BeforeEach
	void setUp() throws Exception {

		jug1 = new Jugador();

	}

	@AfterEach
	void tearDown() throws Exception {
		jug1 = null;
	}
	
	//Test atributos
	@Test
	void testSetDorsal() {
		
		jug1.setDorsal(5);
		
		int valorEsperado = 5;
		int valorObtenido = jug1.getDorsal();
		assertEquals(valorEsperado, valorObtenido);
		
	}//END testSetDorsal
	
	@Test
	void testSetTarjetaAmarilla() {
		
		jug1.setNumeroTarjetasAmarillas(2);
		
		int valorEsperado = 2;
		int valorObtenido = jug1.getNumeroTarjetasAmarillas();
		assertEquals(valorEsperado, valorObtenido);
		
	}//END testSetDorsal
	
	@Test
	void testSetTarjetRojas() {
		
		jug1.setNumeroTarjetasRojas(1);
		
		int valorEsperado = 1;
		int valorObtenido = jug1.getNumeroTarjetasRojas();
		assertEquals(valorEsperado, valorObtenido);
		
	}//END testSetDorsal
	
	//Test métodos
	@Test
	void testPonerDorsal() {
		
		/*
		 * El método le asigna la dorsal
		 */
		jug1.ponerDorsal(25);
		int valorEsperado1 = 25;
		int valorObtenido1 = jug1.getDorsal();
		assertEquals(valorEsperado1, valorObtenido1);
		
		/*
		 * El método le asigna -1 siendo un valor no válido como dorsal
		 */
		jug1.ponerDorsal(60);
		int valorEsperado2=-1;
		int valorObtenido2 = jug1.getDorsal();
		assertEquals(valorEsperado2, valorObtenido2);
		
	}//END testSetDorsal
	
	@Test
	void testEstaExpulsado() {
		
		/*
		 * Con dos tarjetas amarillas el jugador esta expulsado
		 */
		jug1.setNumeroTarjetasAmarillas(2);
		assertTrue(jug1.estaExpulsado());
		
		/*
		 * Con dos tarjetas amarillas el jugador no esta expulsado
		 */
		jug1.setNumeroTarjetasAmarillas(1);
		assertFalse(jug1.estaExpulsado());
		
		/*
		 * Con una tarjeta roja el jugador esta expulsado
		 */
		jug1.setNumeroTarjetasRojas(1);
		assertTrue(jug1.estaExpulsado());
		
		/*
		 * Con cero tarjetas rojas el jugador no esta expulsado
		 */
		jug1.setNumeroTarjetasAmarillas(0);
		assertTrue(jug1.estaExpulsado());
		
	}//END testSetDorsal
	
}//END TestJugador

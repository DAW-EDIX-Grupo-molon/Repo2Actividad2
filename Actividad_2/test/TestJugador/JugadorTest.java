package TestJugador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import solucion.Jugador;
import solucion.Soldado;

class JugadorTest {
	
	/**
	 * En el método ponerDorsal tenemos que contemplar dos casos. Probamos con un número que se encuentre entre
	 * el 1 y el 30 para comprobar que se pone correctamente y con uno fuera del rango
	 * para ver que le asigna el dorsal -1
	 */
	@Test
	public void ponerDorsalPositivo() {
		Jugador jugador = new Jugador();
		jugador.ponerDorsal(13);
		
		int resultadoEsperado = 13;
		int resultadoObtenido = jugador.getDorsal();
			
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	public void ponerDorsalNegativo() {
		Jugador jugador = new Jugador();
		jugador.ponerDorsal(39);
		
		int resultadoEsperado = -1;
		int resultadoObtenido = jugador.getDorsal();
			
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	/**
	 * En el método ponerDorsal probamos con un número que se encuentre entre
	 * el 1 y el 30 para comprobar que se pone correctamente y con uno fuera del rango
	 * para ver que le asigna el dorsal -1
	 */
	
	@Test
	public void testEstaExpulsadoSinTarjetaAmarillaRoja() {
		Jugador jugador = new Jugador();
		jugador.setNumeroTarjetasAmarillas(0);
		jugador.setNumeroTarjetasRojas(0);
		
		
		assertFalse(jugador.estaExpulsado());
	}
	
	@Test
	public void testEstaExpulsadoUnaTarjetaAmarillaNingunaRoja() {
		Jugador jugador = new Jugador();
		jugador.setNumeroTarjetasAmarillas(1);
		jugador.setNumeroTarjetasRojas(0);
		
		
		assertFalse(jugador.estaExpulsado());
	}
	
	@Test
	public void testEstaExpulsadoDosTarjetasAmarillasNingunaRoja() {
		Jugador jugador = new Jugador();
		jugador.setNumeroTarjetasAmarillas(2);
		jugador.setNumeroTarjetasRojas(0);
		
		
		assertTrue(jugador.estaExpulsado());
	}
	
	@Test
	public void testEstaExpulsadoNingunaTarjetaaAmarillaUnaRoja() {
		Jugador jugador = new Jugador();
		jugador.setNumeroTarjetasAmarillas(0);
		jugador.setNumeroTarjetasRojas(1);
		
		
		assertTrue(jugador.estaExpulsado());
	}
	
	@Test
	public void testEstaExpulsadoUnaTarjetaAmarillaUnaRoja() {
		Jugador jugador = new Jugador();
		jugador.setNumeroTarjetasAmarillas(1);
		jugador.setNumeroTarjetasRojas(1);
		
		
		assertTrue(jugador.estaExpulsado());
	}
}

package lauraTestJUnit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import laura.Jugador;

class JugadorTest {


	/*
	 * Para el metodo ponerDorsal creamos un jugador y le indicamos un dorsal, 
	 * simpre que sea el mismo dorsal 
	 * solo comprenden numeros del 1 al 30 inclusive
	 * En caso de que no sea entre esos numeros recibiremos un -1
	 */
	@Test
	public void ponerDorsalPositivo() {
		Jugador jugador = new Jugador();
		jugador.setDorsal(15);
		
		int resultadoEsperado = 15;
		int resultado = jugador.getDorsal();
		}
	@Test
	public void ponerDorsalNegativo() {
		Jugador jugador = new Jugador();
		jugador.setDorsal(55);
		
		int resultadoEsperado = -1;
		int resultado = jugador.getDorsal();
		}
	
	/*
	 * Para este caso ocurren 4 formas: 
	 * 1 que el jugador no reciba tarjeta y devuelve false
	 * 2 jugador recibe una amarilla y no es expulsado recibe false
	 * 3 jugador que recibe dos tarjetas amarillas y es expulsado, devuelve true
	 * 4 que un jugador recibe tarjeta roja y es expulsado y recibe true
	 */
	@Test
	public void estaExpulsadoPositivoUno() {
		Jugador jugador = new Jugador();
		jugador.setNumeroTarjetasAmarillas(0);
		jugador.setNumeroTarjetasRojas(0);
		
		boolean resultadoEsperado = false;
	}
	
	@Test
	public void estaExpulsadoPositivoDos() {
		Jugador jugador = new Jugador();
		jugador.setNumeroTarjetasAmarillas(1);
		jugador.setNumeroTarjetasRojas(0);
		
		boolean resultadoEsperado = false;
	}
	@Test
	public void estaExpulsadoPositivoTres() {
		Jugador jugador = new Jugador();
		jugador.setNumeroTarjetasAmarillas(2);
		jugador.setNumeroTarjetasRojas(0);
		
		boolean resultadoEsperado = true;
		int resultado = jugador.getNumeroTarjetasAmarillas();
	}

	@Test
	public void estaExpulsadoPositivoCuatro() {
		Jugador jugador = new Jugador();
		jugador.setNumeroTarjetasAmarillas(0);
		jugador.setNumeroTarjetasRojas(1);
		
		boolean resultadoEsperado = true;
		int resultado = jugador.getNumeroTarjetasRojas();
	}
}

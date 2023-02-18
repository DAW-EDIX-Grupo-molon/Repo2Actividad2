package solucion;

/**
 * 
 * Clase que representa a un jugador con tres atributos: dorsal, numeroTarjetasAmarillas y numeroTarjetasRojas
 * 
 * Esta clase será usada para un videojuego de fútbol tradicional
 * 
 * @author Grupo_Molon
 * @version 1.0
 *
 * @see Jugador
 */

public class Jugador {

// Atributos
	
	/**
	 * Identificador único mediante representación numérica del jugador. Siempre deben ser números enteros entre 1 y 30.
	 */
	 private int dorsal;
	 
	 /**
	  * Cantidad de tarjetas amarillas asignadas a un jugador. Un jugador puede recibir un máximo de dos por partido. Dos tarjetas amarillas provocan una tarjeta roja y la expulsión del partido.
	  */
     private int numeroTarjetasAmarillas;
    
     /**
      * Cantidad de tarjetas rojas asignadas a un jugador. En cada partido un jugador puede recibir un máximo de una tarjeta roja y es expulsado.
      */
     private int numeroTarjetasRojas;

//Getter and setter - No se documentan

     public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}

	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}


	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}



	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

// Métodos
	/**
	 * Método para la asignación de un dorsal a un jugador. Solo admite enteros entre 1 y 30.
	 * En caso de no ser así, le asigna el "-1"
	 * @param dorsal es el número asignado a cada jugador
	 */
	public void ponerDorsal(int dorsal) {

                   if(dorsal >= 1 && dorsal <= 30) {

                                 this.dorsal = dorsal;

                   }else {

                                 this.dorsal = -1;

                   }

     }

	/**
	 * Método que indica si un jugador está o no expulsado en función del número de tarjetas amarillas y rojas que tiene en un partido.
	 * @return si el jugador tiene dos tarjetas amarillas o una roja devuelve true (expulsado) sino, false.
	 */
     public boolean estaExpulsado() {

                   boolean expulsado = false;                                                  

                   if(numeroTarjetasAmarillas == 2) {

                                 expulsado = true;

                   }                          

                   if(numeroTarjetasRojas == 1) {

                                 expulsado = true;

                   }                          

                   return expulsado;

     }            
}

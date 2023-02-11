package ivan;

/**
 *Clase Jugador.
 *<br>
 *En esta clase podremos crear objetos jugador.
 *<br>
 *<b>Atributos de la clase</b>
 *<ul>
 *<li>int dorsal
 *<li>int numeroTarjetasAmarillas
 *<li>int numeroTarjetasRojas
 *<ul>
 *<br>
 *<b>Métodos de la clase</b>
 *<ul>
 *<li>ponerDorsal();
 *<li>estaExpulsado();
 *<ul>
 *<br>
 *@author GrupoMolon.
 *@version 1.0
 */

public class Jugador {
	// ATRIBUTOS DE CLASE
	/**
	 * Valor numérico asignado a cada jugador
	 */
	 private int dorsal;
	/**
	 * Valor numérico que se asignan a cada jugador en función de las tarjetas amarillas
	 */
     private int numeroTarjetasAmarillas;
     /**
 	 * Valor numérico que se asignan a cada jugador en función de las tarjetas rojas
 	 */
     private int numeroTarjetasRojas;

     //GETTER AND SETTER
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


	//MÉTODOS
	
	/**
	 * Asigna un número de dorsal al jugador.<br>
	 * Este método contiene un sentencia if para controlar si elo número dado es válido para asignar como dorsal.
	 * <br>
	 * @param dorsal
	 */
	public void ponerDorsal(int dorsal) {

                   if(dorsal >= 1 && dorsal <= 30) {

                                 this.dorsal = dorsal;

                   }else {

                                 this.dorsal = -1;

                   }

     }//END ponerDorsal

	/**
	 * Este método contiene una una variable para asginar un <i>true</i> o <i>false</i>.<br>
	 * En función de que tenga asignadas dos o más tarjetas amarillas se le asignará a la variable <i>expulsado</i> true y si tiene una o más tarjetas rojas asignadas también asigna un valor <i>true</i>.
	 * 
	 * 
	 *<br>
	 *@return boolean
	 */

     public boolean estaExpulsado() {

                   boolean expulsado=false;                                                  

                   if(numeroTarjetasAmarillas == 2) {

                	   expulsado = true;

                   }
                   
                   if(numeroTarjetasRojas == 1) {

                	   expulsado = true;

                   }
                   
                   return expulsado;

     }//END estaExpulsado
     
}//END Jugador

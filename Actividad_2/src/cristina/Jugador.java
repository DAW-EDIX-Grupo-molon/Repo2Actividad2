package cristina;

/**
 * 
 * Hace referencia a la entidad Jugador.
 * 
 * @author Grupo_molón
 * 
 * @version 1.0v
 *
 */
public class Jugador {
	
	/**
	 * El número que tiene asignado el jugador en su equipo.
	 */
	 private int dorsal;
	 
	 /**
	  * El número de tarjetas amarillas que tiene el jugador.
	  */
     private int numeroTarjetasAmarillas;

     /**
	  * El número de tarjetas rojas que tiene el jugador.
	  */
     private int numeroTarjetasRojas;
         
     //Métodos “get” y “set”.
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


	/**
	 * 
	 * Este método asignará el número de dorsal pasado por parametro a la propiedad
	 * dorsal del objeto jugador, pero unicamente cuando el número pasado sea  un 
	 * valor comprendido entre 1 y 30, incluyendo ambos números. En caso contratio 
	 * se le pondrá de valor -1.
	 * 
	 * @param dorsal representa el número de dorsal a asignar al jugador.
	 * 
	 */
	public void ponerDorsal(int dorsal) {

                   if(dorsal >= 1 && dorsal <= 30) {

                                 this.dorsal = dorsal;

                   }else {

                                 this.dorsal = -1;

                   }

     }

	/**
	 * 
	 * Este método nos expone si el objeto jugador está o no expulsado 
	 * en función del número de Tarjetas que tenga. Si el jugador tiene el valor 2
	 * en la propiedad numeroTarjetasAmarillas o el valor 1 en la propiedad 
	 * númeroTarjetasRojas, significará que está expulsado.
	 * 
	 * @return devuelve verdadero si el jugador ha sido expulsado, es decir, si el jugador tiene el valor 2 
	 * tarjetas amarillas y/o una roja. En caso contrario devuelve falso
	 * en el caso de que el jugador no haya sido expulsado.
	 * 
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

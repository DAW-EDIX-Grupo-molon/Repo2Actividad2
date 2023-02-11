package laura;

/**
 * 
 * Esta clase sirve para aplicar toda la logica de negocio de la clase jugador
 * 
 * @author Grupo Molon
 * @see Jugador
 *
 */
public class Jugador {
	
	/*
	 * Dorsal del Jugador, numero enteros comprendidos entre el 1 y el 30
	 */
	 private int dorsal;

	 /*
	  * Cantidad de tarjetas Amarillas que puede recibir un jugador, maximo 2 para ser expulsado
	  */
     private int numeroTarjetasAmarillas;

     /*
      * Cantidad de tarjetas rojas que puede recibir un jugador, con una el jugador es expulsado
      */
     private int numeroTarjetasRojas;

                  

     /**
      * Metodo que establece el dorsal del jugador el cual tiene que ser entre 1 y 30
      * @param dorsal
      */

     public void ponerDorsal(int dorsal) {

                   if(dorsal >= 1 && dorsal <= 30) {

                                 this.dorsal = dorsal;

                   }else {

                                 this.dorsal = -1;

                   }

     }

	/**
	 * Método que devuelve un valor true o false si el jugador está expulsado
	 * @return si son dos tarjetas amarilas es expulsado si es un aroja tambien (devuelve true)
	 * en el resto de casos no es expulsado (devuelve false)
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
	

    
	  //Creaccio de getter y setters
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
}


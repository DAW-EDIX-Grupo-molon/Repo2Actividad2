package solucion;

/**
 * Clase que representa a un soldado con dos atributos: estarMuerto, numeroBalas
 * 
 * Esta clase será usada para un videojuego shooter
 * 
 * @author Grupo_Molon
 * @version 1.0
 *
 * @see Soldado
 *
 */

public class Soldado {
	
//Atributos
	/**
	 * El soldado puede estar vivo o muerto
	 */
	private boolean estaMuerto;
	/**
	 * El soldado puede tener balas para disparar. No hay máximo y no admite negativos.
	 */
    private int numeroBalas;


//Getter and setter - No se documentan
    public boolean isEstaMuerto() {
		return estaMuerto;
	}



	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}



	public int getNumeroBalas() {
		return numeroBalas;
	}



	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}

//Métodos
	
	/**
	 * Método que devuelve si un soldado puede o no disparar en función del número de balas del que dispone.
	 * 
	 * @return si el jugador tiene una o más balas devuelve true, por lo tanto puede disparar
	 */

	public boolean puedeDisparar() {

                  if(this.numeroBalas > 0) {

                                return true;

                  }                          

                  return false;

    }

   /**
    * 
    * Método en el que el soldado dispara a otro, se le resta una bala al número de balas y en función de si este muere, devuelve true o false.
    * 
    * @param sol es el objeto al que dispara nuestro soldado
    */

    public void disparar(Soldado sol) {

                  this.numeroBalas--;

                  sol.estaMuerto = true;

    }
}

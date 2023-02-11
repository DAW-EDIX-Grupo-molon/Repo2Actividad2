package ivan;


/**
 *Clase Jugador.
 *<br>
 *En esta clase podremos crear objetos soldado.
 *<br>
 *<b>Atributos de la clase</b>
 *<ul>
 *<li>boolean estaMuert
 *<li>int numeroBalas
 *<ul>
 *<br>
 *<b>Métodos de la clase</b>
 *<ul>
 *<li>puedeDisparar();
 *<li>disparar();
 *<li>disparar();
 *<ul>
 *<br>
 *@author GrupoMolon.
 *@version 1.0
 */

public class Soldado {
	// ATRIBUTOS DE CLASE
	/**
	* Estado del soldado <i>true</i> el soldado esta muerto y <i>false</i> el soldado esta vivo.
	*/
	private boolean estaMuerto;
	/**
	* Número de balas de las que dispone el objeto soldado.
	*/
    private int numeroBalas;

  //GETTER AND SETTER
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


	//MÉTODOS
	
	/**
	 * El metodo nos indica si el objeto soldado puede disparar o no en función de la variable <i>numeroBalas</i>
	 * <br>
	 * @return boolean
	 */
	public boolean puedeDisparar() {

                  if(this.numeroBalas > 0) {

                	  return true;

                  }                          

                  return false;

    }//END puedeDisparar

	/**
	 *Este métdo nos permite <i> matar</i> a un soldado.<br>
	 *Se le pasa a este método como parametro un objeto de la clase Soldado.
	 * <br>
	 * @param sol
	 */
    public void disparar(Soldado sol) {

                  this.numeroBalas--;

                  sol.estaMuerto = true;

    }//END disparar
    
}//END Soldado

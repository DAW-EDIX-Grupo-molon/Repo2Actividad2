package cristina;

/**
 * 
 * Hace referencia a la entidad Soldado.
 * 
 * @author Grupo_molón
 * 
 * @version 1.0 v
 *
 */
public class Soldado {
	
	/**
	 * El objeto soldado puede estar muerto si es verdadero, de lo contrario si es falso no.
	 */
	private boolean estaMuerto;

	/**
	 * Es el número de balas del objeto soldado.
	 */
    private int numeroBalas;

    //Métodos “get” y “set”.
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

	/**
	 * 
	 * Este método analizará según la propiedad numeroBalas del objeto soldados si se puede disparar. 
	 * Si el soldado tiene un valor de numeroBalas superior a 0 podrá disparar, en caso contrario no 
	 * podrá disparar.
	 * 
	 * @return devuelve verdadero si el soldado tiene balas, es decir, si  el numeroBalas es superior 
	 * al valor 0. En caso contrario daría falso y no podría disparar.
	 * 
	 */
	public boolean puedeDisparar() {

                  if(this.numeroBalas > 0) {

                                return true;

                  }                          

                  return false;
    }

	/**
	 * 
	 * Método que asigna verdadero a la propiedad estaMuerto del objeto Soldado pasado por parámetro, y
	 * resta -1 al valor de la propiedad numeroBalas del objeto Soldado que realiza el comportamiento disparar.
	 * 
	 * @param sol representa al objeto soldado al que vamos a disparar.
	 */
    public void disparar(Soldado sol) {

                  this.numeroBalas--;

                  sol.estaMuerto = true;
    }
}

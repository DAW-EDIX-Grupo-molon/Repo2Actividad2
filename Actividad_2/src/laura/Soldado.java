package laura;
/**
 * 
 * Esta clase sirve para aplicar toda la logica de negocio de la clase soldado
 * 
 * @author Grupo Molon
 * @see Jugador
 *
 */
public class Soldado {
	
	/*
	 * Un soldado tiene una vida, puede estar vivo o muerto
	 */
	private boolean estaMuerto;
	/*
	 * Un soldado tiene una cantidad de balas 
	 */
    private int numeroBalas;

  
	/**
	 * Metodo que devuelve si puede disparar
	 * 
	 * @return si las balas son mayor a 0 devuelve true.
	 * en caso contrario devuelve falso 
	 */
    public boolean puedeDisparar() {

                  if(this.numeroBalas > 0) {

                                return true;

                  }                          

                  return false;

    }

   
    /*
     * El Soldado dispara a otro soldado, el soldado que es disparado muere y devuelve true
     */
    public void disparar(Soldado sol) {

                  this.numeroBalas--;

                  sol.estaMuerto = true;
                 
    }


   /*
    * El soldado está muerto, no le quedan vidas
    */
	public boolean isEstaMuerto() {
		return estaMuerto;
	}


	 //Creaccion de Getter y Setter
	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}



	public int getNumeroBalas() {
		return numeroBalas;
	}



	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}
}
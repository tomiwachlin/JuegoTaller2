package entidadesInmoviles;

/**
 * Clase para crear instancias de BolaDePoder y darles comportamiento
 * @author Tom�s Wachlin
 * @author Juan Cruz Bosisio
 * 
 */

public abstract class Comida {

	protected int puntaje;
	
	/**
	 * M�todo abstracto. Da comportamiento a las subclases de Comida
	 * @return puntaje int
	 */
	public abstract int getPuntaje(); 
	
	/**
	 * Modifica el puntaje actual
	 * @param  puntaje int se env�a un int para modificar el puntaje actual
	 */
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	/**
	 * @return true : si el objeto es instancia de Comida
	 */
	public boolean esComida() {
		return true;
	}
	
	public abstract void colisionConPacMan();
}


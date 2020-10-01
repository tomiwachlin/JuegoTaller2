package entidadesInmoviles;


/**
 * Clase para crear instancias de Pelotita y darles comportamiento
 * @author Tomás Wachlin
 * @author Juan Cruz Bosisio
 * 
 */
public class Pelotita extends Comida{
	
	/**
	 * Constructor de PacDot. Al instaciar un objeto de tipo PacDot le
	 * da su puntaje
	 */ 	
	public Pelotita(){
		this.puntaje=10;
	}
	/**
	 * @return el puntaje correspondiente a un PacDot
	 */
	public int getPuntaje(){
		return this.puntaje;
	}

	/**
	 * @return true : si el objeto es instancia de PacDot
	 */
	public boolean esPacDot() {
		return true;
	}

	/**
	 * Se encarga de la lógica cuando hay una colision con PacMan
	 */
	public void colisionConPacMan(){
	}
	
}
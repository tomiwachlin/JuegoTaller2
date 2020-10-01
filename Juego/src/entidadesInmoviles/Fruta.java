package entidadesInmoviles;


/**
 * Clase para crear instancias de Fruta y darles comportamiento
 * @author Tomás Wachlin
 * @author Juan Cruz Bosisio
 * 
 */
public class Fruta extends Comida{

	/**
	 * Constructor de BolaDePoder. Al instanciar un objeto de tipo BolaDePoder le
	 * da su puntaje
	 */ 
	public Fruta(){ 
		this.puntaje=30;
	}
	/**
	 * @return el puntaje correspondiente a una bola de poder
	 */
	public int getPuntaje(){ 
		return this.puntaje;
	}
	/**
	 * @return true : si el objeto es instancia de BolaDePoder
	 */
	public boolean esBolaDePoder() { 
		return true;
	}
	/**
	 * Se encarga de la lógica cuando hay una colision con PacMan
	 */
	public void colisionConPacMan(){
	}

}
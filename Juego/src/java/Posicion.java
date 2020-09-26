package java;

/**
 * Clase Posicion
 * Tiene como atributos: int posX, int posY
 * @author Tomas
 * 
 * 
 */
public class Posicion {
	
	private int posX;
	private int posY;
	
	//Seccion de métodos
	
	/**
	 * Constructor de la clase
	 */
	public Posicion() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * getPosicion
	 * @return int
	 */
	public int getPosX() {
		return posX;
	}
	
	/**
	 * setPosX
	 * @param posX
	 */
	public void setPosX(Integer posX) {
		this.posX = posX;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getPosY() {
		return posY;
	}
	
	/**
	 * setPosY
	 * @param posY
	 */
	public void setPosY(Integer posY) {
		this.posY = posY;
	}

}

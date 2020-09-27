package java;
/**
 * Clase jugador la cual tiene la inforamcion del usuario durante la partida
 * Atributos:
 * String nombre: nombre del jugador
 * int puntaje: puntaje del jugador
 * int vidas: cantidad de vidas del jugador
 */
public class Jugador {

	private String nombre;
	private int puntaje;
	private int vidas;
	
	/**
	 * Constructor
	 */
	public Jugador () {
		
	}
	
	/**
	 * Metodo getNombre
	 * @return retorna el nombre del jugador
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Metodo setNombre
	 * Permite asignarle un nombre al jugador
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Metodo getPuntaje
	 * @return devuelve el puntaje del jugador
	 */
	public int getPuntaje() {
		return puntaje;
	}
	
	/**
	 * Metodo setPuntaje permite asignarle puntaje al jugador 
	 * @param puntaje
	 */
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	/**
	 * Metodo getVidas 
	 * @return devuelve la cantidad de vidas que tiene el jugador
	 */
	public int getVidas() {
		return vidas;
	}
	
	/**
	 * Metodo setVidas permite asignar vidas al jugador
	 * @param vidas 
	 */
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	

}

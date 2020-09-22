package java;

public class Jugador {

	private String nombre;
	private int puntaje;
	private int vidas;
	
	
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

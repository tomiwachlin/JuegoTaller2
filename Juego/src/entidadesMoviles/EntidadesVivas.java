package entidadesMoviles;

import java.Posicion;

/**
 * Darles comportamiento a los personajes
 * @author Tomás Wachlin
 * @author Juan Cruz Bosisio
 * 
 */
public abstract class EntidadesVivas{
	private Posicion posicion;
	private String color;
	private String nombre;
	private String estado;
	
	/**
	 * Constructor nulo de Personaje
	 */
	public EntidadesVivas() {
	}
	/**
	 * Metodo getColor
	 * @return devuelve el color de la entidad
	 */
	public String getColor() {
		return color;
	}
	/**
	 * Metodo setColor
	 * Se encarga de asiganar un color a la entidad
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * Metodo getPersonaje
	 * @return devuelve el nombre del personaje
	 */
	public String getPersonaje() {
		return nombre;
	}
	/**
	 * Metodo setPersonaje
	 * Asigna un nombre de personaje a la entidad
	 * @param personaje
	 * 
	 */
	public void setPersonaje(String personaje) {
		this.nombre = personaje;
	}

	/**
	 * Metodo getEstado
	 * @return Devuelve el estado que posee la entidad
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Metodo setEstado
	 * Asigna el estado de la entidad
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	/**
	 * Se encarga del movimiento de la clase lo implementa la sublclase
	 * @return
	 */
	public abstract boolean mover ();
	
}

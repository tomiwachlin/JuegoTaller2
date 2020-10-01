package entidadesInmoviles;

import java.Posicion;

/**
 * Da un marco a todos aquellos elementos que no cambian su posicion en todo el Juego
 * @author Tomás Wachlin
 * @author Juan Cruz Bosisio
 * 
 */
public abstract class EntidadesInmoviles {
	private  String nombre;
	private Posicion posicion;
	
	
////////// SECCION DE METODOS ///////////////////	
	
	/**
	 * Constructor
	 */
	public EntidadesInmoviles() {
		
	}
	/**
	 * Metodo getNombre
	 * @return nombre
	 * Devuelve el nombre de la entidad inmovil
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Metodo setNombre
	 * @param nombre
	 * Le asigna un nombre a la entidad inmovil
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Metodo getPosicion
	 * @return posicion
	 * Devuelve la posicion en la que se encuentra la entidad inmovil
	 */
	public Posicion getPosicion() {
		return posicion;
	}
	/**
	 * Metodo setPosicion
	 * @param posicion
	 * Le asigna una posicion a la entidad inmovil
	 */
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	
	
	public abstract void colisionConPacMan();
}

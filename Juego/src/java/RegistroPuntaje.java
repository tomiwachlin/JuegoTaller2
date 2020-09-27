package java;
import java.util.ArrayList;

/**
 * Base para guardar informacion de los usuarios que jugaron alguna vez
 * Tiene como metodos:
 * String nombre: nombre del usuario
 * Integer puntuacion: puntuacion del usuario
 */
public class RegistroPuntaje {
	
	private String nombre;
	private Integer puntuacion;
	
	/**
	 * Constructor de RegistroPuntaje
	 */
	public RegistroPuntaje() {
	}
	
	/**
	 * Metodo getNombre
	 * @return nombre
	 * Devuelve el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Metodo setNombre
	 * @param nombre
	 * Asigna un nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Metodo getPuntuacion
	 * @return puntuacion
	 * Devuelve la puntuacion
	 */
	public Integer getPuntuacion() {
		return puntuacion;
	}
	
	/**
	 * Metodo setPuntuacion
	 * @param puntuacion
	 * Asigna una puntuacion
	 */
	public void setPuntuacion(Integer puntuacion) {
		this.puntuacion = puntuacion;
	}





}

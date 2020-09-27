package java;


/**
 * Clase Entidades vivas es la super clase de los objetos que se mueven
 * Esta clase tiene los atributos: Posicion, String color, String personaje, String estado.
 * @author Tomas
 *
 */
public abstract class EntidadesVivas{
	private Posicion posicion;
	private String color;
	private String personaje;
	private String estado;
	
	/**
	 * Constructor de la clase
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
		return personaje;
	}

	/**
	 * Metodo setPersonaje
	 * Asigna un nombre de personaje a la entidad
	 * @param personaje
	 * 
	 */
	public void setPersonaje(String personaje) {
		this.personaje = personaje;
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

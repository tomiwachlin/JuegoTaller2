package java;

public abstract class EntidadesInmoviles {
	
	/**
	 * Es el nombre que puede tener la EntidadInmovil
	 */
	private  String nombre;

	/**
	 * Posicion que pueda tener la EntidadInmovil
	 */
	private Posicion posicion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
}

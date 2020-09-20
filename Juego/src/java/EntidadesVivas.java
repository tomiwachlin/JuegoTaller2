package java;

public abstract class EntidadesVivas{
	private Posicion posicion;
	private String color;
	private String personaje;
	private String estado;
	
	public EntidadesVivas() {
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPersonaje() {
		return personaje;
	}

	public void setPersonaje(String personaje) {
		this.personaje = personaje;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}

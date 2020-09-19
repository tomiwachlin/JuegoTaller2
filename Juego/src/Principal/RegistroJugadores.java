package Principal;
import Util.Fecha;

public class RegistroJugadores {
	private String nombre;
	private Integer puntuacion;
	private Fecha fechaDeRegistro;

	public RegistroJugadores() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(Integer puntuacion) {
		this.puntuacion = puntuacion;
	}

	public Fecha getFechaDeRegistro() {
		return fechaDeRegistro;
	}

	public void setFechaDeRegistro(Fecha fechaDeRegistro) {
		this.fechaDeRegistro = fechaDeRegistro;
	}

}

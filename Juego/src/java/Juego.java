package java;
import java.util.ArrayList;

public class Juego{
	

	/**
	 * Jugador de la partida
	 */
	private Jugador jugador;
	
	/**
	 * Vector que tiene a las entidades vivas (PacMan - Fantasmas)
	 */
	private EntidadesVivas[] vectorEntidadesVivas;
	
	/**
	 * 
	 */
	private Mapa mapa;
	
	
	// Sección de métodos
	
	/**
	 * Constructor de la clase
	 */
	public Juego() {
	}
	


	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public EntidadesVivas[] getVectorEntidadesVivas() {
		return vectorEntidadesVivas;
	}

	public void setVectorEntidadesVivas(EntidadesVivas[] vectorEntidadesVivas) {
		this.vectorEntidadesVivas = vectorEntidadesVivas;
	}

	public Mapa getMapa() {
		return mapa;
	}

	public void setMapa(Mapa mapa) {
		this.mapa = mapa;
	}
	
	
	
	/**
	 * Metodo con el loop del juego
	 */
	public void jugar () {
		
	}

	
}

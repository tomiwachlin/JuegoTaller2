package java;
import java.util.ArrayList;

/**
 * La clase Juego es la que se encarga del loop del juego y de crear
 * los objetos que son parte del mismo
 *  Tiene como atributos: Jugador, EntidadesVivas[], Mapa
 * @author Tomas
 * 

 */
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
	

	/**
	 * Metodo getJugador
	 * @return Jugador
	 */
	public Jugador getJugador() {
		return jugador;
	}
	/**
	 * setJugador
	 * @param jugador
	 * 
	 */
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	/**
	 * getVectorEntidadesVivas
	 * @return vectorEntidadesVivas
	 */
	public EntidadesVivas[] getVectorEntidadesVivas() {
		return vectorEntidadesVivas;
	}
	/**
	 * setVectorEntidadesVivas
	 * @param vectorEntidadesVivas
	 */
	public void setVectorEntidadesVivas(EntidadesVivas[] vectorEntidadesVivas) {
		this.vectorEntidadesVivas = vectorEntidadesVivas;
	}
	/**
	 * getMapa
	 * @return Mapa
	 */
	public Mapa getMapa() {
		return mapa;
	}
	/**
	 * setMapa
	 * @param mapa
	 */
	public void setMapa(Mapa mapa) {
		this.mapa = mapa;
	}
	
	
	
	/**
	 * Metodo con el loop del juego
	 */
	public void jugar () {
		
	}

	
}

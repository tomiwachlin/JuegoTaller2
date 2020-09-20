package java;

import java.util.ArrayList;

public class Juego{
	
	/**
	 * Lista con el registro de puntajes de jugadores
	 */
	private ArrayList<RegistroJugadores> listaDeRegistro= new ArrayList<RegistroJugadores>();
	
	/**
	 * 
	 */
	private ArrayList<RegistroJugadores> mejoresPuntajes= new ArrayList<RegistroJugadores>();
	
	
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
	
	
	/**
	 * Constructor de la clase
	 */
	public Juego() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Metodo con el loop del juego
	 */
	public void jugar () {
		
	}
	
}

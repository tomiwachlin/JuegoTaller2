package java;
import java.util.ArrayList;

import entidadesMoviles.EntidadesVivas;
import entidadesMoviles.Fantasmas;



/**
 * La clase Juego es la que se encarga del loop del juego y de crear
 * los objetos que son parte del mismo
 *  Tiene como atributos: Jugador, EntidadesVivas[], Mapa
 * @author Tomas
 * 

 */
public class Juego{

	
	private ArrayList<RegistroPuntaje> historialPuntajes;
	private ArrayList<RegistroPuntaje> mejoresPuntajes;
	private int puntaje;
	private EntidadesVivas[] vectorEntidadesVivas; //Vector que tiene a los Fantasmas
	private Mapa mapa; //Mapa de juego
	private int cantPelotitas; //Cantidad total de pelotitas en el mapa
	private int cantComidas; //Cantidad de pelotitas comidas
	private int vidas;
	
	
/////////// Secci�n de m�todos/////////////////////
	
	/**
	 * Constructor nulo de la clase
	 */
	public Juego() {
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
	 * Modifica la cantidad de vidas, restando una al total
	 */
	public void quitarVida() {
		this.vidas = this.vidas - 1;
	}
	/**
	 * Modifica el puntaje actual
	 * 
	 * @param unScore
	 *            int . Le paso un int para modificar el puntaje acumulado
	 */
	public void setPuntaje(int unScore) {
		this.puntaje = unScore;
	}
	
	/**
	 * 
	 * @return Si PacMan se choc� con un fantasma devuelve true
	 */
	public boolean huboColision () {
		return false;
	}
	/**
	 * 
	 * @return Devuelve cual de los fantasmas fue el que se choc� con PacMan
	 */
	public Fantasmas quienColisiono() {
		return null;
	}
	/**
	 * M�todo que se encarga de eliminar el
	 * comestible que haya comido PacMan
	 */
	public void restarComestible () {
	}
	/**
	 * Mata fantasma comido
	 */
	public void matarFantasma() {
	}
	/**
	 * M�todo para actualizar el historial de puntajes
	 */
	public void actualizarRanking() {
	}
	/**
	 * Finaliza el juego seg�n corresponda teniendo en cuenta si ganas o perdes
	 */
	public void terminarJuego () {
		
	}
	/**
	 * Metodo con el loop del juego
	 */
	public void jugar () {
	}

	
}

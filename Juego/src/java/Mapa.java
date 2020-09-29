package java;

import entidadesInmoviles.EntidadesInmoviles;

/**
 * Clase que se encarga de crear el mapa y darle posicion a las entidades inmoviles del juego
 * Tiene como atributos:
 * EntidadesInmoviles[][] matriz: matriz que simboliza las posiciones y crea a las entidades inmoviles
 */
public class Mapa {

	private EntidadesInmoviles[][] matriz;
	
	/**
	 * Constructor
	 */
	public Mapa() {
		
	}
	/**
	 * Cantidad de pelotitas con las que comienza el mapa
	 */
	private int cantPelotitas;
	/**
	 * Cantidad de pelotitas que va comiendo Pacman
	 */
	private int cantComidas;
	
	/**
	 * Constructor de la clase Mapa
	 * @param dimX
	 * @param dimY
	 */
	public Mapa(int dimX,int dimY) {
		matriz = new EntidadesInmoviles[dimX][dimY];
	}
	/**
	 * Metodo: getCantPelotitas
	 * @return cantPelotitas
	 * Se encarga de devolver la cantidad de pelotitas que hay
	 */
	public int getCantPelotitas() {
		return cantPelotitas;
	}
	
	/**
	 * Metodo: setCantPelotitas
	 * @param cantPelotitas
	 * Asigna la cantidad pelotitas que hay
	 */
	public void setCantPelotitas(int cantPelotitas) {
		this.cantPelotitas = cantPelotitas;
	}
	
	/**
	 * Metodo: getCantComidas
	 * @return cantComidas
	 * Devuelve cantidad de pelotitas que comio Pac Man
	 */
	public int getCantComidas() {
		return cantComidas;
	}
	
	/**
	 * Metodo: setCantComidas
	 * @param cantComidas
	 * Asigna la cantidad de pelotitas que comio Pac Man
	 */
	public void setCantComidas(int cantComidas) {
		this.cantComidas = cantComidas;
	}
}

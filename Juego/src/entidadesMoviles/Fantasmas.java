package entidadesMoviles;

import java.Posicion;

import Util.TipoMovimiento;

public abstract class Fantasmas extends EntidadesVivas {
	
	private boolean estaMuerto;
	private Posicion objetivoDispersion;
	private TipoMovimiento movimiento;
	
	/**
	 * Constructor nulo de Fantasmas.
	 */
	public Fantasmas() {
	}
	/**
	 * Se encarga de la lógica del choque con PacMan
	 */
	public void colisionConPacMan () {
	}
	//Setea el modo del fantasma (Persecucion, asustado, etc..)
	public void dispararSuModo () {
	}
	/**
	 * Metodo que cambia el modo del fantasma a volver a casa y lo pone en
	 * estado "muerto"
	 */
	public void morir() {
		//Falta implementar el metodo para que vuelva a casa
		this.estaMuerto = true;
	}
	
	public abstract void darUnPaso(int veces);
	
	public abstract boolean puedoSalir();
}

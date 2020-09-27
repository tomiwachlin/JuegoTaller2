package java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase Main es la que se encarga de lanzar el Juego
 * Tiene como atributos: historialPuntajes, mejoresPuntajes y Juego
 * @author Tomas
 *
 */
public class Main {
	
	private ArrayList<RegistroPuntaje> historialPuntajes= new ArrayList<RegistroPuntaje>();
	private ArrayList<RegistroPuntaje> mejoresPuntajes= new ArrayList<RegistroPuntaje>();	
	private static Juego juego;
	
	
	public ArrayList<RegistroPuntaje> getHistorialPuntajes() {
		return historialPuntajes;
	}

	/**
	 * setHistorialPuntajes
	 * @param historialPuntajes
	 */
	public void setHistorialPuntajes(ArrayList<RegistroPuntaje> historialPuntajes) {
		this.historialPuntajes = historialPuntajes;
	}
	
	/**
	 * getMejoresPuntajes
	 * @return ArrayList<RegistroPuntaje>
	 */
	public ArrayList<RegistroPuntaje> getMejoresPuntajes() {
		return mejoresPuntajes;
	}
	
	/**
	 * setMejoresPuntajes
	 * @param mejoresPuntajes
	 */
	public void setMejoresPuntajes(ArrayList<RegistroPuntaje> mejoresPuntajes) {
		this.mejoresPuntajes = mejoresPuntajes;
	}
	
	/**
	 * Método que se encargará de lanzar el juego
	 * @param args
	 */
	public static void main(String[] args) {
		juego = new Juego();
		
	}
	


}

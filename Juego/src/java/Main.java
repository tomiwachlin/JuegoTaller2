package java;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	/**
	 * Lista con el registro de puntajes de jugadores
	 */
	private ArrayList<RegistroPuntaje> historialPuntajes= new ArrayList<RegistroPuntaje>();
	
	/**
	 * 
	 */
	private ArrayList<RegistroPuntaje> mejoresPuntajes= new ArrayList<RegistroPuntaje>();
	
	
	
	private static Juego juego;
	
	
	public ArrayList<RegistroPuntaje> getHistorialPuntajes() {
		return historialPuntajes;
	}

	public void setHistorialPuntajes(ArrayList<RegistroPuntaje> historialPuntajes) {
		this.historialPuntajes = historialPuntajes;
	}

	public ArrayList<RegistroPuntaje> getMejoresPuntajes() {
		return mejoresPuntajes;
	}

	public void setMejoresPuntajes(ArrayList<RegistroPuntaje> mejoresPuntajes) {
		this.mejoresPuntajes = mejoresPuntajes;
	}
	

	public static void main(String[] args) {
		juego = new Juego();
		
	}
	


}

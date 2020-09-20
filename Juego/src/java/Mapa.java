package java;

public class Mapa {
	
	private EntidadesInmoviles[][] matriz;
	
	/**
	 * Cantidad de pelotitas con las que comienza el mapa
	 */
	private int cantPelotitas;
	/**
	 * Cantidad de pelotitas que va comiendo Pacman
	 */
	private int cantComidas;
	public Mapa(int posX,int popY) {
		matriz = new EntidadesInmobiles[posX][posY];
	}
}

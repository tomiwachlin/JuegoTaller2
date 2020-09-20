package java;

public class Mapa {
	
	
	/**
	 * Matriz que corresponde al campo de juego
	 */
	private EntidadesInmoviles[][] matriz;
	
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

	public int getCantPelotitas() {
		return cantPelotitas;
	}

	public void setCantPelotitas(int cantPelotitas) {
		this.cantPelotitas = cantPelotitas;
	}

	public int getCantComidas() {
		return cantComidas;
	}

	public void setCantComidas(int cantComidas) {
		this.cantComidas = cantComidas;
	}
}

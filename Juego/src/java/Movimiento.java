package java;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public final class Movimiento implements KeyListener{
	private final static int numeroTeclas = 120;
	private final boolean[] teclas = new boolean[numeroTeclas];
	public boolean arriba;
	public boolean abajo;
	public boolean izquierda;
	public boolean derecha;
	
	public Movimiento() {
		arriba = teclas[KeyEvent.VK_W];
		abajo = teclas[KeyEvent.VK_S];
		izquierda = teclas[KeyEvent.VK_A];
		derecha = teclas[KeyEvent.VK_D];
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		teclas[arg0.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		teclas[arg0.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}
}


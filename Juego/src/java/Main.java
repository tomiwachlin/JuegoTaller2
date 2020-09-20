package java;
import Util.*;

import java.util.Scanner;

public class Main {
	private static Movimiento mover;

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("PAC-MAN");
		mover = new Movimiento();
		addKeyListener(mover);
		System.out.println("chupala");
		
	}

}

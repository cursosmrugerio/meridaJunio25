package com.curso.v3;

import java.util.Random;

class Ave {
	String tipo = "Ave";
	void volarAve() {
		System.out.println("Volar como Ave");
	}
}

class Pato extends Ave {
	String tipo = "Pato";
	void volarPato() {
		System.out.println("Volar como Pato");
	}
}

class PatoSilvestre extends Pato {
	String tipo = "PatoSilvestre";
	void volarPatoSilvestre() {
		System.out.println("Volar como Pato Silvestre");
	}
}

class PatoJuguete extends Pato {
	String tipo = "PatoJuguete";
	void volarPatoJuguete() {
		System.out.println("Volar como Pato Juguete");
	}
}

public class Principal0 {

	public static void main(String[] args) {
		
		Ave ave = getAve();
		
		((PatoSilvestre)ave).volarPatoSilvestre();
	}

	private static Ave getAve() {
		
		Ave[] aves = new Ave[] {
				new Ave(),
				new Pato(),
				new PatoSilvestre(),
				new PatoJuguete()
		};
		
		int i = new Random().nextInt(aves.length);
		
		Ave ave = aves[i];
		
		System.out.println(ave.getClass().getSimpleName());
		
		return ave;
	}

}

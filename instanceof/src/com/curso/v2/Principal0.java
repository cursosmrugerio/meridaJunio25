package com.curso.v2;
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
		
		//PatoSilvestre ps = new PatoJuguete();
		
		Ave ave = new PatoJuguete();
		
		Pato pato = (Pato)ave;
		
		PatoJuguete patoJuguete = (PatoJuguete)pato;
		
		patoJuguete.volarPatoJuguete();
		
//		PatoSilvestre patoSilvestre = (PatoSilvestre)pato;
//		
//		patoSilvestre.volarPatoSilvestre(); //ClassCastException
//		
	}

}

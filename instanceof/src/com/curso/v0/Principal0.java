package com.curso.v0;
class Ave {
	void volarAve() {
		System.out.println("Volar como Ave");
	}
}

class Pato extends Ave {
	void volarPato() {
		System.out.println("Volar como Pato");
	}
}

class PatoSilvestre extends Pato {
	void volarPatoSilvestre() {
		System.out.println("Volar como Pato Silvestre");
	}
}

public class Principal0 {

	public static void main(String[] args) {

		System.out.println("***pato1***");
		PatoSilvestre pato1 = new PatoSilvestre();
		pato1.volarPatoSilvestre();
		pato1.volarPato();
		pato1.volarAve();
		
		System.out.println("***pato2***");
		Ave pato2 = new PatoSilvestre();
		
		//pato2..volarPatoSilvestre(); //NO
		((PatoSilvestre)pato2).volarPatoSilvestre(); //SI
		
		//pato2.volarPato(); //NO
		((Pato)pato2).volarPato(); //SI
		
		pato2.volarAve(); //SI
		
	}

}

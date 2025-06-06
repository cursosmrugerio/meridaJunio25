package com.curso.v1;
class Ave {
	String tipo = "Ave";
}

class Pato extends Ave {
	String tipo = "Pato";
}

class PatoSilvestre extends Pato {
	String tipo = "PatoSilvestre";
}

public class Principal0 {

	public static void main(String[] args) {
		
		PatoSilvestre pato1 = new PatoSilvestre();
		System.out.println(pato1.tipo);
		
		Pato pato2 = new PatoSilvestre();
		//System.out.println(pato2.tipo);
		System.out.println(((PatoSilvestre)pato2).tipo);
		
		Ave pato3 = new PatoSilvestre();
		//System.out.println(pato3.tipo);
		System.out.println(((PatoSilvestre)pato3).tipo);
		
	}

}

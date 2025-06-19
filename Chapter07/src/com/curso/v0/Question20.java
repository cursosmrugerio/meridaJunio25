package com.curso.v0;

class Ave{
	String tipo = "Ave";
	void volar() {
		System.out.println("Ave volar");
	}
	static void nadar() {
		System.out.println("Ave nadar");
	}
}
class Pato extends Ave{
	String tipo = "Pato";
	@Override
	void volar() {
		System.out.println("Pato volar");
	}
	//HIDDEN
	static void nadar() {
		System.out.println("Pato nadar");
	}
}
public class Question20 {
	public static void main(String[] args) {
		Ave ave1 = new Pato();
		ave1.volar();
		System.out.println(ave1.tipo);
		ave1.nadar();
		Ave.nadar();
		Pato.nadar();

	}

}

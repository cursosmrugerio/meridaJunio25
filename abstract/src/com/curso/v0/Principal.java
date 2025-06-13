package com.curso.v0;

class Ave{
	void volar() {
		System.out.println("Volar Ave");
	}
}
class Aguila extends Ave{
	@Override
	void volar() {
		System.out.println("Volar Aguila");
	}
}
public class Principal {
	public static void main(String[] args) {
		Ave ave1 = new Ave();
		ave1.volar();
		//El objeto define el comportamiento 
		Ave ave2 = new Aguila(); 
		ave2.volar(); //POLIMORFISMO
	}

}

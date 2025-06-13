package com.curso.v2;

abstract class Ave{
	abstract void volar(); //SIN COMPORTAMIENTO
}
class Aguila extends Ave{
	@Override
	void volar() {
		System.out.println("Volar Aguila");
	}
}
public class Principal {
	public static void main(String[] args) {
		//El objeto define el comportamiento 
		Ave ave = new Aguila(); 
		ave.volar(); //POLIMORFISMO
	}

}

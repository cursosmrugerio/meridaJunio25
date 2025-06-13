package com.curso.v3;

import java.util.List;
import java.util.Random;

abstract class Ave{
	abstract void volar(); 
	
	static void saludar() {
		System.out.println("hello");
	}
}

class Aguila extends Ave{
	@Override
	void volar() {
		System.out.println("Volar Aguila");
	}
}
class Pato extends Ave{
	@Override
	void volar() {
		System.out.println("Volar Pato");
	}
}
class Pinguino extends Ave{
	@Override
	void volar() {
		System.out.println("Volar Pinguino");
	}
}
class Colibri extends Ave{
	@Override
	void volar() {
		System.out.println("Volar Colibri");
	}
}

public class Principal {
	public static void main(String[] args) {
		Ave ave = getAve(); //PaginaWeb,Rest,Console
		System.out.println(
				ave.getClass().getSimpleName());
		ave.volar(); //POLIMORFISMO
	}

	private static Ave getAve() {
		List<Ave> lista = List.of(
				new Aguila(),
				new Colibri(),
				new Pato(),
				new Pinguino());
		int i = lista.size();
		int aleatorio = new Random().nextInt(i);
		Ave ave = lista.get(aleatorio);
		return ave;
	}

}

package com.curso.v4;

import java.util.List;
import java.util.Random;

interface Ave{
	void volar(); //public,abstract 
}
class Aguila implements Ave{
	@Override
	public void volar() {
		System.out.println("Volar Aguila");
	}
}
class Pato implements Ave{
	@Override
	public void volar() {
		System.out.println("Volar Pato");
	}
}
class Pinguino implements Ave{
	@Override
	public void volar() {
		System.out.println("Volar Pinguino");
	}
}
class Colibri implements Ave{
	@Override
	public void volar() {
		System.out.println("Volar Colibri");
	}
}

public class Principal {
	public static void main(String[] args) {
		System.out.println("Interface");
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

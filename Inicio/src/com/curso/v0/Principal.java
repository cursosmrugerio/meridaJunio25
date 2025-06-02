package com.curso.v0;

public class Principal {

	public static void main(String[] args) {
		
		StringBuilder cadena = new StringBuilder("Hola");
		int i = 10;
		
		procesa(cadena,i);
		
		System.out.println(cadena); //Hola Mundo
		System.out.println(i); //10

	}

	private static void procesa(StringBuilder cadena, int i) {
		cadena.append(" Mundo");
		i = i + 10;
	}

}

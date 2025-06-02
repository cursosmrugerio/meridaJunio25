package com.curso.v0;

public class Principal1 {

	public static void main(String[] args) {
		
		String s = "Hello";  //INMUTABLE
		StringBuilder cadena = new StringBuilder("Hola"); //MUTABLE
		int i = 10; //PRIMITIVO
		procesa(cadena,i,s);
		
		System.out.println(cadena); //Hola Mundo
		System.out.println(i); //10
		System.out.println(s); //Hello

	}

	private static void procesa(StringBuilder cadena, int i,String s) {
		cadena.append(" Mundo"); //MUTABLE
		i = i + 10; //i = 20
		s.concat(" World"); 
	}

}

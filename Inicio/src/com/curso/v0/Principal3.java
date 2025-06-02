package com.curso.v0;

public class Principal3 {

	public static void main(String[] args) {
		
		String s = "Hello";  //INMUTABLE
		StringBuilder cadena = new StringBuilder("Hola"); //MUTABLE
		int i = 10; //PRIMITIVO
		s = procesa(cadena,i,s);
		
		System.out.println(cadena); //Hola Mundo
		System.out.println(i); //10
		System.out.println("s: "+s); //Hello World

	}

	private static String procesa(StringBuilder cadena, int i,String s) {
		cadena.append(" Mundo"); //MUTABLE
		i = i + 10; //i = 20
		return s.concat(" World");  //<====
	}

}

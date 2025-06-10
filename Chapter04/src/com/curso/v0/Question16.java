package com.curso.v0;

public class Question16 {

	public static void main(String[] args) {
		
		String s = "HOLA\\tMUNDO";
		
		System.out.println(s.translateEscapes());
		
		System.out.println("************");

		String base = "ewe\nsheep\\t";
		
		System.out.println(base);
		//ewe //salto linea \n
		//sheep\t
		
		int length = base.length();
		//System.out.println(length); //11
		
		int indent = base.indent(2).length();
		System.out.println(indent); //16
		
		System.out.println(base.indent(2));
		
		System.out.println("*********");
		
		String cadena2 = base.translateEscapes(); //ewe\nsheep\t
		System.out.println("cadena2: "+cadena2);
		int translate = base.translateEscapes().length();
		System.out.println("translate: "+translate); //10
		
		String formatted = "length: %d, indent: %d, translate: %d".formatted(length, indent, translate); 
		System.out.format(formatted);
		
	}

}

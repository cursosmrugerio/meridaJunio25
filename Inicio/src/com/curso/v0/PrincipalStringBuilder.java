package com.curso.v0;

public class PrincipalStringBuilder {

	public static void main(String[] args) {
		
		boolean r;

		StringBuilder s1 = new StringBuilder("Hola"); //OBJETO MUTABLE
		StringBuilder s4 = new StringBuilder("Hola");

		r = (s1 == s4);
		System.out.println(r); //false
		
		r = (s1.equals(s4)); // ==
		System.out.println(r); //false

		s1.append(" Mundo");
		
		System.out.println(s1); //Hola Mundo
		
		
		
		
		
	}

}

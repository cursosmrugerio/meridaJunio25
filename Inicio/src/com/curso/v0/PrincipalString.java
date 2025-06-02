package com.curso.v0;

public class PrincipalString {

	public static void main(String[] args) {
		
		boolean r;

		String s1 = "Hola"; //OBJETO INMUTABLE
		String s2 = "Hola";
		String s3 = "Hola";
		String s4 = new String("Hola");

		r = (s1 == s4);
		System.out.println(r); //false
		
		r = (s1.equals(s4));
		System.out.println(r); //true
		
		s1 = s1.concat(" Mundo");
		
		System.out.println(s1); //Hola Mundo

		
		
		
		
		
		
	}

}

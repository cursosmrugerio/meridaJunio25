package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		
		boolean r;

		Alumno a1 = new Alumno("Patrobas");
		Alumno a2 = new Alumno("Patrobas");
		
		r = a1 == a2;
		
		System.out.println(r); //false
		
		r = a1.equals(a2); // ==
		
		System.out.println(r); //true //DEPENDER SI SOBREESCRIBE equals()
		
		int i1 = 5;
		int i2 = 5;
		
		//r = i1.equals(i2); //ERROR COMPILE
		
		r = i1 == i2;
		System.out.println(r);


	}

}

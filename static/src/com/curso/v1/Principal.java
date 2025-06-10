package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(Estudiante.contador); //0

		Estudiante e1 = new Estudiante("Patrobas");
		Estudiante e2 = new Estudiante("Filologo");
		Estudiante e3 = new Estudiante("Andronico");
		
		System.out.println(e1.contador); //3
		System.out.println(e2.contador); //3
		System.out.println(e1.contador); //3
		
		System.out.println(Estudiante.contador); //3
//		System.out.println(Estudiante.contador); //3
//		System.out.println(Estudiante.contador); //3
		



	
	}

}

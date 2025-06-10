package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		System.out.println(new Estudiante("Rufo").contador);
		
		Estudiante e1 = new Estudiante("Patrobas");
		Estudiante e2 = new Estudiante("Filologo");
		Estudiante e3 = new Estudiante("Andronico");
		
		System.out.println(e1.contador); //1
		System.out.println(e2.contador); //1
		System.out.println(e3.contador); //1
		
		System.out.println(e1.nombre); 
		System.out.println(e2.nombre); 
		System.out.println(e3.nombre);



	
	}

}

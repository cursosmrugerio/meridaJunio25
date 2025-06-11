package com.curso.v3;

import com.curso.v2.Estudiante;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(Estudiante.getContador()); //0

		Estudiante e1 = new Estudiante("Patrobas");
		Estudiante e2 = new Estudiante("Filologo");
		Estudiante e3 = new Estudiante("Andronico");
	
		System.out.println(Estudiante.getContador()); //3

	}

}

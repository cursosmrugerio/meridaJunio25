package com.curso.v4;

import static com.curso.v2.Estudiante.getContador;
import static com.curso.v2.Estudiante.contador;
import com.curso.v2.Estudiante;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V4");
		
		System.out.println(getContador()); //0

		Estudiante e1 = new Estudiante("Patrobas");
		Estudiante e2 = new Estudiante("Filologo");
		Estudiante e3 = new Estudiante("Andronico");
	
		System.out.println(getContador()); //3
		
		System.out.println(contador);

	}

}

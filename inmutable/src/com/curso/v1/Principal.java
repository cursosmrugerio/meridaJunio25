package com.curso.v1;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Integer> calificaciones = new ArrayList<>();
		calificaciones.add(9);
		calificaciones.add(10);
		calificaciones.add(8);

		StringBuilder matricula = new StringBuilder("XYZ123");
		
		AlumnoRecord patrobas = new AlumnoRecord("Patrobas",matricula,calificaciones);
		
		System.out.println(patrobas);
		
		System.out.println(patrobas.nombre());
		System.out.println(patrobas.matricula());
		System.out.println(patrobas.calificaciones());


	}

}

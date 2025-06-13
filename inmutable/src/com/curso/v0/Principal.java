package com.curso.v0;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Integer> calificaciones = new ArrayList<>();
		calificaciones.add(9);
		calificaciones.add(10);
		calificaciones.add(9);

		StringBuilder matricula = new StringBuilder("XYZ");
		
		Alumno patrobas = new Alumno("Patrobas",matricula,calificaciones);
		
		matricula.append("123");
		patrobas.getMatricula().append("123");
		
		calificaciones.add(5);
		patrobas.getListaCal().add(0);
		
		System.out.println(patrobas);
		
		
	}

}

package com.curso.v0;

import java.util.ArrayList;
import java.util.List;

//CLASE SEA INMUTABLE
public final class Alumno {
	
	private final String nombre;
	private final StringBuilder matricula;
	private final List<Integer> listaCal;
	
	public Alumno(String nombre, StringBuilder matricula, List<Integer> listaCal) {
		this.nombre = nombre;
		this.matricula = new StringBuilder(matricula);
		this.listaCal = new ArrayList<>(listaCal);
	}

	public String getNombre() {
		return nombre;
	}

	public StringBuilder getMatricula() {
		return new StringBuilder(matricula);
	}

	public List<Integer> getListaCal() {
		return new ArrayList<>(listaCal);
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", matricula=" + matricula + ", listaCal=" + listaCal + "]";
	}

}

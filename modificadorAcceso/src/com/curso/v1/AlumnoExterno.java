package com.curso.v1;

import com.curso.v0.Alumno;

public class AlumnoExterno extends Alumno {
	
	public static void main(String[] args) {
		AlumnoExterno ae = new AlumnoExterno();
		ae.nombre = "Patrobas";
		ae.edad = 18;
	}

}

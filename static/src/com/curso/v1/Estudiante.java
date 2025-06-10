package com.curso.v1;

public class Estudiante {
	
	String nombre;
	static int contador; //0 //PERTENECE A LA CLASE
	
	Estudiante(String nombre){
		this.nombre = nombre;
		contador++;
	}



}

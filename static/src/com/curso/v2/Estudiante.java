package com.curso.v2;

public class Estudiante {
	
	String nombre;
	private static int contador; //0 //PERTENECE A LA CLASE
	
	Estudiante(String nombre){
		this.nombre = nombre;
		contador++;
	}

	static int getContador(){
		return contador;
	}


}

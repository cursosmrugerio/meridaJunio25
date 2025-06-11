package com.curso.v2;

public class Estudiante {
	
	String nombre;
	public static int contador; //0 //PERTENECE A LA CLASE
	
	public Estudiante(String nombre){
		this.nombre = nombre;
		contador++;
	}

	public static int getContador(){
		return contador;
	}


}

package com.curso.v0;

public class Alumno {
	
	static {
		System.out.println("Bloque static 1"); //1
	}

	public static void main(String[] args) {
		Alumno a1 = new Alumno();
		System.out.println(a1);
		Alumno a2 = new Alumno();
		System.out.println(a2);
	}
	
	Alumno(){
		System.out.println("PASO POR CONSTRUCTOR"); //3
	}

	@Override
	public String toString() {
		return "Alumno []";
	}
	
	static {
		System.out.println("Bloque static 2"); //2
	}

	
}

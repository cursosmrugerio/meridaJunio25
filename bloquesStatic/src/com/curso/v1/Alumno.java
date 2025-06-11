package com.curso.v1;

public class Alumno {
	
	static {
		System.out.println("Bloque static 1"); 
	}
	
	{
		System.out.println("Bloque instancia 1");
	}

	public static void main(String[] args) {
//		Alumno a1 = new Alumno();
//		System.out.println(a1);
//		Alumno a2 = new Alumno();
//		System.out.println(a2);
		System.out.println("JAVA");
	}
	
	Alumno(){
		System.out.println("PASO POR CONSTRUCTOR"); 
	}
	
	{
		System.out.println("Bloque instancia 2"); 
	}


	@Override
	public String toString() {
		return "Alumno []";
	}
	
	static {
		System.out.println("Bloque static 2"); 
	}

	
}

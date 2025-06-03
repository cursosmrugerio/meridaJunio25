package com.curso.v0;

public class Alumno {
	
	{
		System.out.println("Bloque Instancia 1");
	}

	public static void main(String[] args) {
		
		Alumno a1 = new Alumno();
		
		{
			System.out.println(a1);
		}
		
		{
			Alumno a2 = new Alumno();
			System.out.println(a2);
		}
		
		

	}
	
	Alumno(){
		System.out.println("PASO POR CONSTRUCTOR");
	}

	@Override
	public String toString() {
		return "Alumno []";
	}
	
	{
		System.out.println("Bloque Instancia 2");
	}

	
}

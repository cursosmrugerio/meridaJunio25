package com.curso.v0;

enum DiaSemana{
	LUNES, 
	MARTES, 
	MIERCOLES, 
	JUEVES, 
	VIERNES,
	SABADO, 
	DOMINGO
}

public class Principal {

	public static void main(String[] args) {

		System.out.println(DiaSemana.MARTES);
		
		DiaSemana descanso = DiaSemana.DOMINGO;
		
		System.out.println(descanso);
		
	}

}

package com.curso.v1;

enum DiaSemana{
	LUNES, 
	MARTES("bajo"),
	MIERCOLES("medio"),
	JUEVES("medio"),
	VIERNES("alto"),
	SABADO("alto"),
	DOMINGO;
	
	String visitas;
	
	//Constructor private
	DiaSemana(String visitas) {
		this.visitas = visitas;
	}
	
	DiaSemana() {
	}
}

public class Principal {

	public static void main(String[] args) {

		System.out.println(DiaSemana.MARTES);
		System.out.println(DiaSemana.MARTES.visitas);

		
		DiaSemana descanso = DiaSemana.DOMINGO;
		
		System.out.println(descanso);
		System.out.println(descanso.visitas);

		
	}

}

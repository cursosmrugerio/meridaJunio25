package com.curso.v2;

import java.io.Serializable;

//final
//extends java.lang.Enum
enum DiaSemana implements Serializable{
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

		for (DiaSemana ds : DiaSemana.values()) {
			System.out.println(ds.toString());
			System.out.println(ds.name());
			System.out.println(ds.ordinal());
		}
		
		System.out.println("********");
		DiaSemana dia = DiaSemana.valueOf("DOMINGO");
		System.out.println(dia);
		
		

		
	}

}

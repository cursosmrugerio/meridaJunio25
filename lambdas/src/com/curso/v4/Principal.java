package com.curso.v4;

import java.util.List;

record Empleado(String nombre,int edad,double sueldo) {}

public class Principal {

	public static void main(String[] args) {
		Empleado e1 = new Empleado("Herodion",17,20.98);
		Empleado e2 = new Empleado("Aristobulo",30,30.26);
		Empleado e3 = new Empleado("Urbano",25,18.16);
		Empleado e4 = new Empleado("Nereo",16,15.46);
		Empleado e5 = new Empleado("Epeneto",35,15.08);
		List<Empleado> listaEmpleados = List.of(e1,e2,e3,e4,e5);
		
		listaEmpleados.forEach(System.out::println);
		
	}
	
}

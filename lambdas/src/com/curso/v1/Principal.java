package com.curso.v1;

import java.util.List;

record Empleado(String nombre,int edad,double sueldo) {}

public class Principal {

	public static void main(String[] args) {
		Empleado e1 = new Empleado("Herodion",18,20.98);
		Empleado e2 = new Empleado("Aristobulo",30,30.26);
		Empleado e3 = new Empleado("Urbano",25,18.16);
		Empleado e4 = new Empleado("Nereo",16,15.46);
		Empleado e5 = new Empleado("Epeneto",35,15.08);
		List<Empleado> listaEmpleados = List.of(e1,e2,e3,e4,e5);
	
		Predicado pre1 = x -> x.edad() > 17; //DEFINICION LAMBDA	
		Predicado pre2 = pato -> pato.nombre().length() > 6; //DEFINICION LAMBDA
		
		System.out.println("¿ES MAYOR DE EDAD?");
		show(listaEmpleados,pre1);
		
		System.out.println("¿LONGITUD DE NOMBRE MAYOR A 6?");
		show(listaEmpleados,pre2);
		
		System.out.println("¿SALARIO MAYOR A 20?");
		show(listaEmpleados, z -> z.sueldo()>20.0);

	}
	
	static void show(List<Empleado> lista,Predicado pre) {
		for(Empleado e : lista) {
			boolean res = pre.probar(e); //EJECUCION DE LA LAMBDA
			System.out.println(e);
			System.out.println("Resultado: "+res);
		}//INVESTIGAR PORQUE SON OBLIGATORIAS LAS LLAVES SI SOLO ES UNA LINEA
		
	}

}

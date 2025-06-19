package com.curso.v0;

record Empleado(String nombre,int edad,double sueldo) {}

public class Principal {

	public static void main(String[] args) {
		
		boolean res;
		
		Empleado e1 = new Empleado("Herodion",18,20.98);
		Empleado e2 = new Empleado("Aristobulo",30,30.26);
		Empleado e3 = new Empleado("Urbano",25,18.16);
		Empleado e4 = new Empleado("Nereo",16,15.46);
		Empleado e5 = new Empleado("Epeneto",35,45.08);
		
		Predicado pre1 = x -> x.edad() > 17; //DEFINICION LAMBDA

		res = pre1.probar(e1); //EJECUTO LA LAMBDA
		System.out.println(e1);
		System.out.println(res);
		
		res = pre1.probar(e4); //EJECUTO LA LAMBDA
		System.out.println(e4);
		System.out.println(res);
		
		Predicado pre2 = pato -> pato.nombre().length() > 6; //DEFINICION LAMBDA
		
		res = pre2.probar(e3); //EJECUTO LA LAMBDA
		System.out.println(e3);
		System.out.println(res); 
		
		res = pre2.probar(e5); //EJECUTO LA LAMBDA
		System.out.println(e5);
		System.out.println(res); 

	}

}

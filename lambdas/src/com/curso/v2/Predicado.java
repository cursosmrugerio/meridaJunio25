package com.curso.v2;

@FunctionalInterface
public interface Predicado {
	boolean probar(Empleado e);

	// A PARTIR DE JAVA8 //public
	static void metodoStatic(String s) {
		System.out.println("Método static: " + s);
	}

	// A PARTIR DE JAVA8 //public
	default void metodoDefault(String s) {
		System.out.println("Método default: " + s);
	}
	
	//A PARTIR DE JAVA9 
	//static private
	//private (instancia)

}

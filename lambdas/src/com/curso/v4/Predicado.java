package com.curso.v4;

@FunctionalInterface
public interface Predicado {
	boolean probar(Empleado e);
	
	static Predicado and(Predicado pre1, Predicado pre2) {
		return x -> pre1.probar(x) && pre2.probar(x);
	}

}

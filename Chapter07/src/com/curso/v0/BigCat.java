package com.curso.v0;

public interface BigCat {

	// public static final
	int x = 5;

	abstract String getName();

	static int hunt() {
		// getName(); //PORQUE ES DE INSTANCIA
		return x;
	}

	default void climb() {
		rest();
	}

	private void roar() {
		getName();
		climb();
		hunt();
	}

	private static boolean sneak() {
		//roar();
		return true;
	}

	private int rest() {
		return 2;
	};

}

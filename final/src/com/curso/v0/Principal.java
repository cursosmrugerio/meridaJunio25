package com.curso.v0;

class Ave{
	//EL METODO NO SE PUEDE SOBREESCRIBIR
	//NO SE APLICA EL OVERRIDE
	final void volar() {}
	
	//NO SE PUEDE OCULTAR (HIDDEN)
	final static void getName() {}
}

//LA CLASE final NO PUEDE SER HEREDADA
final class Pato extends Ave{
	//@Override
	//void volar() {}
	
	//HIDDEN (OCULTAR)
	//static void getName() {}
}

//class PatoSilvestre extends Pato{}

public class Principal {

	public static void main(String[] args) {

		//final EN PRIMITIVOS SON CONSTANTES.
		final int x = 10;
		//x = 0;
		
		//CONTINUA SIENDO MUTABLE
		final StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World").append(" Java");
		System.out.println(sb);
		
		//NO SE PUEDA CAMBIAR LA REFERENCIA
		//sb = new StringBuilder("Hola");
		//sb = null;
		
		final String s = "Hola";
		//s = "Mundo";
		//s = null;
		
	}

}

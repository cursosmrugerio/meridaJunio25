package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		int x = 8;
		int y = 0;
		
		int r = dividir(x,y);
		System.out.println("Resultado: "+r);
		
		System.out.println("Fin de Programa");
		
		
	}

	private static int dividir(int x, int y) {
		return x/y; //ArithmeticException
	}

}

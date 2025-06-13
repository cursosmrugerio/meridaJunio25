package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		int x = 8;
		int y = 0;
		
		try {
			int r = dividir(x,y);
			System.out.println("Resultado: "+r);
		}catch(Throwable e){
			//e.printStackTrace();
			System.out.println("No se puede dividir entre Cero");
		}
		
		System.out.println("Fin de Programa");
		
		
	}

	private static int dividir(int x, int y) {
		return x/y; //ArithmeticException
	}

}

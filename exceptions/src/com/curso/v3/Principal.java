package com.curso.v3;

public class Principal {

	public static void main(String[] args) {

		int x = 8;
		int y = 0;
				
		try {
			int r = dividir(x,y);
			System.out.println("Resultado: "+r);
		} catch (DividirCeroException e) {
			e.printStackTrace();
		}
	
		System.out.println("Fin de Programa");
		
		
	}

	private static int dividir(int x, int y) throws DividirCeroException {
		if (y==0)
			throw new DividirCeroException("No se puede dividir entre cero");
		return x/y; 
	}

}

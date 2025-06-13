package com.curso.v4;

public class Principal {

	public static void main(String[] args) {

		int x = 8;
		int y = -2;
				
		try {
			int r = dividir(x,y);
			System.out.println("Resultado: "+r);
		} catch (DividirCeroException e) {
			e.printStackTrace();
		} catch (NegativoException e) {
			e.printStackTrace();
		}
	
		System.out.println("Fin de Programa");
		
	}

	private static int dividir(int x, int y) throws DividirCeroException, NegativoException {
		if (y==0)
			throw new DividirCeroException("No se puede dividir entre cero");
		else if (y<0)
			throw new NegativoException("Numero no puede ser negativo");
		
		return x/y; 
	}

}

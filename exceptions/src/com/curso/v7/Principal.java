package com.curso.v7;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V7");

		int x = 1008;
		int y = 100;
				
		try {
			int r = dividir(x,y);
			System.out.println("Resultado: "+r);
			
			String cadena = null;
			//cadena.length();
			
		} catch (DividirCeroException | NegativoException | UnsupportedOperationException 
									 | NullPointerException e) {
			System.out.println(e);
			//e.printStackTrace();
		} 		
	
		System.out.println("Fin de Programa");
		
	}

	private static int dividir(int x, int y) throws DividirCeroException, NegativoException{
		if (y==0)
			throw new DividirCeroException("No se puede dividir entre cero");
		else if (y<0)
			throw new NegativoException("Numero no puede ser negativo");
		else if (x>1000)
			throw new UnsupportedOperationException("X no puede ser mayor a 1000");
		return x/y; 
	}

}

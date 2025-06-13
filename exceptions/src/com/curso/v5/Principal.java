package com.curso.v5;

public class Principal {

	public static void main(String[] args) {

		int x = 8;
		int y = 2;
				
		try {
			int r = dividir(x,y);
			System.out.println("Resultado: "+r);
			
			String cadena = null;
			cadena.length();
			
		} catch (DividirCeroException e) {
			e.printStackTrace();
		} catch (NegativoException e) {
			e.printStackTrace();
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
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

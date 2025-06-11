package com.curso.v0;

public class Question07 {
	
	//NIVEL DE PERMISOS, DE MAYOR A MENOR
	//public -> protected -> Package Access (defualt*) -> private

	public static void main(String[] args) {
		int r = juggle(true, new boolean[]{true, true});
		
		r = juggle(true, new boolean[2]);
		
		System.out.println(r);

	}

	static public int juggle(boolean b, boolean... b2) {
		return b2.length;
	}
}

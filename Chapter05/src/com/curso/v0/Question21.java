package com.curso.v0;

public class Question21 {

	public static void main(String[] args) {

		moo(1, new int[] {1,2,3});
		moo();
		
		// moo(1,2,3); //CASO PARA INVESTIGAR
		
	}
	
	static public void moo(int m, int... n) {
		System.out.println("int m, int... n");
	}
	
	static private void moo(int... x) {
		System.out.println("int... x");
	}

}

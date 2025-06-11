package com.curso.v0;

public class Principal2 {
	
	public static void main(String... args) {
		show(1,2,3,4,5);
		show(1,2,3);
		show();
		show(1,2,3,4,5,6,7,8);
	}

	private static void show(int... arrayints) {
		System.out.println("***VarArgs***");

		for (int i:arrayints) 
			System.out.println(i);
		
	}

}

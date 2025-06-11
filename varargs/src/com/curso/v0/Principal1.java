package com.curso.v0;

public class Principal1 {
	
	public static void main(String... args) {
		
		show(new int[]{1,2,3,4,5});
		show(new int[]{1,2,3});
		show(new int[]{});
		
	}

	private static void show(int... arrayints) {
		System.out.println("***VarArgs***");

		for (int i:arrayints) {
			System.out.println(i);
		}
		
	}

}

package com.curso.v0;

public class Principal0 {
	
	public static void main(String[] args) {
		
		show(new int[]{1,2,3,4,5});
		show(new int[]{1,2,3});
		show(new int[]{});
		
	}

	private static void show(int[] arrayints) {
		System.out.println("*****");

		for (int i:arrayints) {
			System.out.println(i);
		}
		
	}

}

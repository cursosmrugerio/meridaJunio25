package com.curso.v0;

public class Principal3 {
	
	public static void main(String... args) {
		show("A",1,2,3,4,5);
		show("B",1,2,3);
		show("C");
		show("D",1,2,3,4,5,6,7,8);
	}

	private static void show(String s,int... arrayints) {
		System.out.println("***VarArgs***");

		for (int i:arrayints) 
			System.out.println(i);
		
	}

}

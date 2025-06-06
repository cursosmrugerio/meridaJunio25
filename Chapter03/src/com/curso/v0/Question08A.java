package com.curso.v0;

public class Question08A {

	public static void main(String[] args) {
		printType(Integer.valueOf(5));
		printType(15);
		System.out.println("Fin Programa");
	}
	
	static void printType(Object o) {
		if(o instanceof Integer i) {
			System.out.println("int");
			if (i < 10)
				System.out.println("small int");
			else if (i < 20)
				System.out.println("long");
			else
				System.out.println("unknown");
		}
		
	}

}

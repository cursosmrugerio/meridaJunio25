package com.curso.v0;

public class Question08 {

	public static void main(String[] args) {
		printType(Integer.valueOf(5));
		printType(15);
		System.out.println("Fin Programa");
	}
	
	static void printType(Object o) {
		if(o instanceof Integer) {
			System.out.println("int");
			if ((Integer)o < 10)
				System.out.println("small int");
			else if ((Integer)o < 20)
				System.out.println("long");
			else
				System.out.println("unknown");
		}
		
	}

}

package com.curso.v0;

public class Question4E {

	public static void main(String[] args) {
		String cadena = printReptile(8);
		System.out.println(cadena);
	}

	// JAVA14
	static String printReptile(int category) {

		return switch (category) {
			case 1, 2 -> {
				System.out.println("Snake0");
				System.out.println("Snake1");
				System.out.println("Snake2");
				yield "Snake";
				}
			case 3, 4 -> "Lizard";
			case 5, 6 -> "Turtle";
			case 7, 8 -> "Alligator";
			default -> "Pato";
		};
		
	}

}

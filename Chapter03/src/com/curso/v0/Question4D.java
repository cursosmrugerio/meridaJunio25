package com.curso.v0;

public class Question4D {

	public static void main(String[] args) {
		printReptile(1);
	}

	// JAVA14
	static void printReptile(int category) {

		String cadena = switch (category) {
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
		
		System.out.println("Cadena: "+cadena);

		
	}

}

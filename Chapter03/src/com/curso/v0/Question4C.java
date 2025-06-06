package com.curso.v0;

public class Question4C {

	public static void main(String[] args) {
		printReptile(1);
	}

	// JAVA14
	static void printReptile(int category) {

		switch (category) {
			case 1, 2 -> {
				System.out.println("Snake0");
				System.out.println("Snake1");
				System.out.println("Snake2");
				}
			case 3, 4 -> System.out.println("Lizard");
			case 5, 6 -> System.out.println("Turtle");
			case 7, 8 -> System.out.println("Alligator");
		};
		
	}

}

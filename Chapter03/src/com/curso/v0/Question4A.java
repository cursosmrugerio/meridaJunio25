package com.curso.v0;

public class Question4A {

	public static void main(String[] args) {
		printReptile(2);
	}

	//JAVA8
	static void printReptile(int category) {
		switch (category) {
		
		case 1: case 2:
			System.out.println("Snake0");
			System.out.println("Snake1");
			System.out.println("Snake2");
			break;
		case 3: case 4:
			System.out.println("Lizard");
			break;
		case 5: case 6:
			System.out.println("Turtle");
			break;
		case 7: case 8:
			System.out.println("Alligator");
			break;
		default: 
			System.out.println("Pato");
		};
	}

}

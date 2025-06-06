package com.curso.v0;

public class Question4B {

	public static void main(String[] args) {
		printReptile(1);
	}

	//JAVA8
	static void printReptile(int category) {
		switch (category) {
		
		case 1, 2:
			System.out.println("Snake");
			break;
		case 3, 4:
			System.out.println("Lizard");
			break;
		case 5, 6:
			System.out.println("Turtle");
			break;
		case 7, 8:
			System.out.println("Alligator");
			break;
		default: 
			System.out.println("Pato");
		};
	}

}

package com.curso.v0;

public class Question4 {

	public static void main(String[] args) {
		printReptile(10);
		//Pato Snake
	}

	//JAVA8
	static void printReptile(int category) {
		switch (category) {
		
		case 1:
			System.out.println("Snake");
			break;
		case 3:
			System.out.println("Lizard");
			break;
		case 5:
			System.out.println("Turtle");
			break;
		case 7:
			System.out.println("Alligator");
			break;
		default: 
			System.out.println("Pato");
		};
	}

}

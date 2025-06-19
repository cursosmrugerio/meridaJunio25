package com.curso.v0;

public class Weather {

	int x = 5;

	// Cualquier enum o interface que se declara dentro de otra
	// clase es siempre e implícitamente static.

	enum Seasons {
		WINTER, SPRING, SUMMER, FALL
	}

	public static void main(String[] args) {

//		System.out.println(new Weather().x);

//		System.out.println(Seasons.SPRING);

		Seasons v = null;

		switch (v) {
		case SPRING -> System.out.print("s");
		case WINTER -> System.out.print("w");
		case SUMMER -> System.out.print("m");
		case null -> System.out.println("missing data null");
		default -> System.out.println("missing data");
		}

	}

}

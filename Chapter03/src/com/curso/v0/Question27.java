package com.curso.v0;

public class Question27 {

	public static void main(String[] args) {

		byte amphibian = 1;

		String name = "Frog";

		String color = switch (amphibian) {

		case 1 -> {
			yield "Red";
		}
		case 2 -> {
			if (name.equals("Frog"))
				yield "Green";
			else
				yield null;
		}
		case 3 -> {
			yield "Purple";
		}
		default -> throw new RuntimeException();
		};
	}

}

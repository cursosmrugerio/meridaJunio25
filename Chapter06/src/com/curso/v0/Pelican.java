package com.curso.v0;

abstract class Bird extends Object {
	private final void fly() {
		System.out.println("Bird");
	}

	protected Bird() {
		super();
		System.out.print("Wow-");
	}
}

public class Pelican extends Bird {

	public Pelican() {
		super();
		System.out.print("Oh-");
	}
	protected void fly() {
		System.out.println("Pelican");
	}

	public static void main(String[] args) {
		Pelican chirp = new Pelican();
		// Wow-Oh-
		chirp.fly();
	}

}

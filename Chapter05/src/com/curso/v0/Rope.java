package com.curso.v0;

public class Rope {
	public static void swing() {
		System.out.print("swing");
	}

	public void climb() {
		System.out.println("climb");
	}

	public static void play() {
		swing();
		//climb();
	}

	public static void main(String[] args) {
		Rope rope = new Rope();
		rope.play();
		System.out.print("-");
		Rope rope2 = null;
		rope2.play();
	}
}
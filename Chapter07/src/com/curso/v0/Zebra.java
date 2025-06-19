package com.curso.v0;

public class Zebra {
	private int x = 24;

	public int hunt() {
		String message = "x is ";
		//Clase local abstract
		abstract class Stripes {
			private int x = 0;

			public void print() {
				System.out.print(message + Zebra.this.x);
			}
			//abstract void saludar();
		}

		Stripes s = new Stripes(){}; //CLASE ANONIMA
		s.print();
		return x;
	}

	public static void main(String[] args) {
		new Zebra().hunt();
	}
}
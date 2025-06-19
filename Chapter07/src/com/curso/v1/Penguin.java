package com.curso.v1;

//abstract
interface Swim {
	//public abstract
	abstract String getName();
	
	static void perform() {
		System.out.print("Swim!");
	}
}

interface Dance {
	static void perform() {
		System.out.print("Dance!");
	}
}

public class Penguin implements Swim, Dance {

	private void doShow() {
		Dance.perform();
		Swim.perform();
	}

	public static void main(String[] eggs) {
		new Penguin().doShow();
	}

	@Override
	public String getName() {
		return null;
	}

}
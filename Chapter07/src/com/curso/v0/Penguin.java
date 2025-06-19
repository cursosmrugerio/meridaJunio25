package com.curso.v0;

interface Swim {
	
	default void perform() {
		System.out.println("Swim!");
	}
}

interface Dance {
	default void perform() {
		System.out.println("Dance!");
	}
}

public class Penguin implements Swim, Dance {
	@Override
	public void perform() {
		System.out.println("Smile!");
	}

	private void doShow() {
		//Swim.super.perform(); 
		//super.Swim.perform();
		//Swim.perform();
		//super.perform();
		perform(); //Smile!
		Dance.super.perform(); 
		Swim.super.perform(); 
	}

	public static void main(String[] eggs) {
		new Penguin().doShow();
	}

}
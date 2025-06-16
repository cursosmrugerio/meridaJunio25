package com.curso.v0;

class Mammal {
	private void eat() {
	}

	protected static void drink() {
	}

	public Integer dance(String p) {
		return null;
	}
}

class Primate extends Mammal { 
	public void eat(String p) {}
}

public class Monkey extends Primate {
	
	public static void drink() throws RuntimeException {} 
	public Number dance(CharSequence p) { return null; } 
	public void eat(String p) {}

}

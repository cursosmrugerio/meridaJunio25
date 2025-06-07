package com.curso.v0;

public class Question28 {

	public static void main(String[] args) {
		getFish("goldie");
	}

	static void getFish(Object fish) {
		if (!(fish instanceof String guppy) ) 
			System.out.print("Eat!");
		else if (!(fish instanceof String guppy1)) { 
			throw new RuntimeException();
		}
		System.out.print("Swim!");
	}

}

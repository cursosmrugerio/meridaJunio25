package com.curso.v0;

enum Animals {
	MAMMAL(true), 
	INVERTEBRATE(Boolean.FALSE), 
	BIRD(false), 
	REPTILE(false), 
	AMPHIBIAN(false), 
	FISH(true) {
		@Override
		public int swim() {
			return 4;
		}
	};

	private final boolean hasHair;

	//private
	Animals(boolean hasHair) {
		this.hasHair = hasHair;
	}

	public boolean hasHair() {
		return hasHair;
	}

	public int swim() {
		return 0;
	}
}

public class PrincipalAnimals {

	public static void main(String[] args) {

//		Animals a = Animals.REPTILE;
//		System.out.println(a.name());
//		System.out.println(a.hasHair()); //false
//		System.out.println(a.swim()); //0
//		
//		a = Animals.FISH;
//		System.out.println(a.name());
//		System.out.println(a.hasHair()); //true
//		System.out.println(a.swim()); //4
		
		for(Animals ani :Animals.values()) {
			System.out.println(ani.name());
			System.out.println("Ordinal: "+ani.ordinal());
			System.out.println(ani.hasHair()); 
			System.out.println(ani.swim()); 
		}

	}

}

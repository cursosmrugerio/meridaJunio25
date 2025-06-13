package com.curso.v0;

class Speedster {
	int numSpots = 1;
}

public class Cheetah extends Speedster {
	int numSpots = 2;

	public Cheetah(int numSpots) {
		super.numSpots = numSpots;
		// INSERT CODE HERE
	}

	public static void main(String[] args) {
		Speedster s = new Cheetah(50);
		System.out.print(s.numSpots);  
		//System.out.print(((Cheetah)s).numSpots); //2
	}
}
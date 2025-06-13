package com.curso.v1;

class SpeedsterAbuelo {
	int numSpots = 0;
}

class Speedster extends SpeedsterAbuelo {
	int numSpots = 1;
	public Speedster(int numSpots) {
		super.numSpots = numSpots;
	}
}

public class Cheetah extends Speedster {
	int numSpots = 2;

	public Cheetah(int numSpots) {
		super(numSpots);
	}

	public static void main(String[] args) {
		SpeedsterAbuelo s = new Cheetah(50);
		System.out.print(s.numSpots);  //50
	}
}
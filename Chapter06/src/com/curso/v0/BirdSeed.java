package com.curso.v0;

public class BirdSeed {
	
	//HAS-A
	private int numberBags; //0
	boolean call; //false
	
	public BirdSeed() { 
		this(2); // LINE 1 
		this.call  = false; 
		// LINE 2 
	}
	
	public BirdSeed(int numberBags) { 
		this.numberBags = numberBags; 
	}
	
	public static void main(String[] args) { 
		BirdSeed seed = new BirdSeed(); 
		System.out.print(seed.numberBags); //2
	}
	

}

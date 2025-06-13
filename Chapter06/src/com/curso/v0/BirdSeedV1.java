package com.curso.v0;

public class BirdSeedV1 {
	
	//HAS-A
	private int numberBags; //0
	boolean call; //false
	
	public BirdSeedV1() { 
		this(10,true); 
	}
	
	public BirdSeedV1(int numberBags) { 
		System.out.println("Constructor 1");
		this.numberBags = numberBags; 
	}
	
	public BirdSeedV1(int numberBags, boolean call) {
		System.out.println("Constructor 2");
		this.numberBags = numberBags; 
		this.call = call;
	}
	
	public static void main(String[] args) { 
		BirdSeedV1 seed = new BirdSeedV1(); 
		System.out.print(seed.numberBags); //10
	}
	

}

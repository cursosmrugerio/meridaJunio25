package com.curso.v0;

public class BirdSeedV2 {
	
	//HAS-A
	private int numberBags; //0
	boolean call; //false
	
	public BirdSeedV2() { 
		this(10); //DELEGAR EL NACIMIENTO A OTRO CONSTRUCTOR
		System.out.println("Constructor 0");

	}
	
	public BirdSeedV2(int numberBags) {
		this(numberBags,true);
		System.out.println("Constructor 1");
	}
	
	public BirdSeedV2(int numberBags, boolean call) {
		System.out.println("Constructor 2");
		this.numberBags = numberBags; 
		this.call = call;
	}
	
	public static void main(String[] args) { 
		BirdSeedV2 seed = new BirdSeedV2(); 
		System.out.print(seed.numberBags); 
		//"Constructor 2"
		//"Constructor 1"
		//"Constructor 0"
		//10
		
	}
	

}

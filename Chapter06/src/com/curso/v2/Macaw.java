package com.curso.v2;
class Bird {
	int feathers = 0; //10
	Bird(int x) {
		this.feathers = x;
	}
}
class Parrot extends Bird {
	int feathers = 1; 
	protected Parrot(int y) {
		super(y);
	}
}
public class Macaw extends Parrot {
	int feathers = 2; 
	public Macaw(int z) {
		super(z);
	}
	public void fly() {
		System.out.println("FLY");
	}
	public static void main(String... sing) {
		Bird p = new Macaw(10);	
		((Macaw)p).fly(); //DOWNCAST
//		Macaw m = (Macaw)p;
//		m.fly();
		
		System.out.println(p.feathers); //Bird 10
		System.out.println(((Parrot)p).feathers); //Parrot 1
		System.out.println(((Macaw)p).feathers); //Macaw 2
		
		
	}
}

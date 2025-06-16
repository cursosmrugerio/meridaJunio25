package com.curso.v4;

class Bird {
	int feathers = 0; //4
	Bird(int x) {
		this.feathers = x;
	}
	Bird fly() {
		return new Bird(1);
	}
}

class Parrot extends Bird {
	protected Parrot(int y) {
		super(y);
	}
	@Override
	protected Parrot fly() {
		return new Parrot(2);
	}
}

public class Macaw extends Parrot {
	public Macaw(int z) {
		super(z);
	}

	@Override
	public Macaw fly() {
		//return this;  //Regresate a ti mismo objeto Macaw
		return new Macaw(3); //Nuevo objeto Macaw
	}

	public static void main(String... sing) {
		System.out.println("V4");
		Bird p = new Macaw(4);
		//System.out.print(((Parrot)p.fly()).feathers); //4
		
		Bird m = p.fly();
		if (m instanceof Macaw)
			System.out.println("Soy un Macaw");
		
		System.out.println(m.feathers); //3
		
		System.out.println(((Macaw)m).feathers); //3
		
	}
}

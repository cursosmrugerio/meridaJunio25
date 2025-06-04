package com.curso.v0;

public class Question08 {

	public static void main(String[] args) {

		int pig = (short)4;
		
		pig = pig++;
		
		System.out.println("pig: "+pig); //4
		
		long goat = (int)2;
		goat -= 1.0; //JAVA IMPLICITAMENTE REALIZA EL CAST
		System.out.println("goat: "+goat); //1
		
		
		double d1 = 1.0;
		long l1 = (long)d1;
		
		short x = 10;
		short y = 3;
		short z = (short)(x * y);
		
		
		
		
	}

}

package com.curso.v0;

public class Question07 {

	public static void main(String[] args) {

		int ph = 7, vis = 2;
		
		//               true   & (  true  )
		boolean clear = vis > 1 & (vis < 9 || ph < 2);
		
		System.out.println("clear: "+clear);
		
		//               false
		boolean safe = (vis > 2) && (ph++ > 1);
		
		System.out.println("safe: "+safe);
		System.out.println("ph: "+ph); //7
		
		//              false
		boolean tasty = 7 <= --ph;
		
		System.out.println("tasty: "+tasty);
		
		System.out.println("ph: "+ph); //7




	}

}

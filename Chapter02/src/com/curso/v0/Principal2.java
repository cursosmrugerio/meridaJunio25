package com.curso.v0;

public class Principal2 {

	public static void main(String[] args) {
		
		for (int i = 0 ; i<10; i++ ) {
			
		//	i = i++; //<=TRAMPA
		//  0   (1 PIERDE)
			
			System.out.println(i);
			
		} 
		
		int b, c;
		int a = b = c = 5;
		
		System.out.println("a: " + a);
		
		//int x = y = z = 10; //COMPILE ERROR
	}

}

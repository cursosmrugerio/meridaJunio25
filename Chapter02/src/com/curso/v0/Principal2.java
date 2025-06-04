package com.curso.v0;

public class Principal2 {

	public static void main(String[] args) {
		
		for (int i = 0 ; i<10; ) {
			
			i = i++; //<=TRAMPA
		//  0   (1 PIERDE)
			
			System.out.println(i);
			
		} 
	}

}

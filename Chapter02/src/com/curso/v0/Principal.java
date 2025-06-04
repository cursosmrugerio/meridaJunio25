package com.curso.v0;

public class Principal {

	public static void main(String[] args) {
		
		int height = 3;
		int length = 5;

		int perimeter = 2 * height + 2 * length; //16
		
		System.out.println(perimeter);
		
		boolean b1 = true;
		
		System.out.println(!b1);
		
		System.out.println("****** Bitwise ********");
		
		int i1 = 5; 
		
		//~x = -x - 1 //REGLA PARA CALCULAR Bitwise complement
		            
		System.out.println(~i1);
		
		int i2 = 50;
		
		// - 50 - 1 
		
		System.out.println(~i2);
		
		int i3 = 1234;
		
		System.out.println(~i3);
		
		System.out.println("**************");

		
		int i4 = 8;
		
		int i5 = 10;
		
		i5 += i4;
		
		System.out.println("i5: "+ i5); //8
		
		
		
		
	}

}

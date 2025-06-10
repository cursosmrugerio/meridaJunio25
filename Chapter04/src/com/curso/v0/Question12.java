package com.curso.v0;

public class Question12 {

	public static void main(String[] args) {
          
		String numbers = "012345678".indent(1); 
		
		//ELIMINA ESPACIOS EN BLANCO DEL INICIO
		numbers = numbers.stripLeading();
		
		System.out.println(numbers);
		
		//                                      EXCLUSIVE
		System.out.println(numbers.substring(1, 3)); //12
		System.out.println(numbers.substring(7, 7)); //nada
		System.out.print(numbers.substring(7)); //78
		
	}

}

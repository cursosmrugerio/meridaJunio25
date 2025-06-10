package com.curso.v0;

public class Question08 {

	public static void main(String[] args) {

		//                                         01234
		StringBuilder builder = new StringBuilder("12345");
		
		//System.out.println(builder.charAt(4)); //5
		
		
		//                         INCLUSIVE,   EXCLUSIVE
		//                                 2,3 => "6"
		StringBuilder s1 = builder.replace(2,   4,     "6");
		System.out.println(s1); //1265
		
		System.out.println(s1.charAt(3)); //5
		
		System.out.println("*******");
		
		//             
		String string = "12345"; 
		
		String cadena = string.replace("123", "1"); //145
		System.out.println(cadena.charAt(2)); //5
		
		//System.out.println(string.charAt(5));

		//System.out.println(string.length());
		
		
	}

}

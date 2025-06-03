package com.curso.v0;

public class Question19 {

	public static void main(String[] args) {

		
		long num1 = Long.parseLong("100");
		
		Long num2 = Long.valueOf("100");
		
		//                                UNBOXING
		System.out.println(Long.max(num1, num2));
				
		System.out.println("**************");
		
		//AUTOBOXING
		Long num3 = Long.parseLong("100");
		
		//UNBOXING
		long num4 = Long.valueOf("100");
		
		System.out.println(Long.max(num3, num4));
		
		
		
	}

}

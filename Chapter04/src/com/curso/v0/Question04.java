package com.curso.v0;

public class Question04 {

	public static void main(String[] args) {

		String s = "Hello";  //POOL DE STRING
		String t = new String(s); //NO ESTA EN EL POOL DE STRING
		
		if ("Hello".equals(s)) 
			System.out.println("one"); //SI
		
		if (t == s) 
			System.out.println("two");
		
		if (t.intern() == s) 
			System.out.println("three"); //SI
		
		if ("Hello" == s) 
			System.out.println("four");
		
		if ("Hello".intern() == t) 
			System.out.println("five");
		
		if ("Hel"+"lo" == s) 
			System.out.println("six");
		
		if (new StringBuilder("Hello").toString() == s) 
			System.out.println("seven");
		
	}

}

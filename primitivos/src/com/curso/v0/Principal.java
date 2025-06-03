package com.curso.v0;

public class Principal {
	
	public static void main(String[] args) {
		
		char ch1 = 97;
		char ch2 = 'a';
		
		System.out.println(ch1);
		System.out.println((int)ch2); 

		char ch3 = 57;
		
		System.out.println(ch3);
		
		System.out.println("******* byte **********");
		
		byte by1 = 1;
		byte by2 = 2;
		
		byte by3 = (byte)(by1 + by2);
		
		System.out.println(by3); 
		
		byte by4 = by1 *= by2;
		
		System.out.println(by4);
		
		byte by5 = (byte)(127 + 1);
		
		System.out.println("127+1= "+by5);
		
		System.out.println("******* short **********");

		short sh1 = 4;
		short sh2 = 5;
		
		short sh3 = (short)(sh1 + sh2);
		
		short sh4 = sh1 *= sh2;
		
		System.out.println(sh4); 
		
		System.out.println("******* int **********");
		
		int i1 = Integer.MAX_VALUE;
		int i2 = Integer.MIN_VALUE;
		
		System.out.println(i1);
		System.out.println(i2);
		
		int i3 = i1 + 1;
		
		System.out.println(i3);
		
		int i4 = -2147483648 -1;
		
		System.out.println("i4: "+i4);
		
		System.out.println("******* long **********");

		long l1 = 2147483648L;
		
		System.out.println(l1);
		
		

	}

}

package com.curso.v0;

public class Question22 {

	public static void main(String[] args) {

		int i1 = 1; //DECIMAL
		int i2 = 010; //8 OCTAL
		System.out.println(i1+i2); //9
		
		int i3 = 0b101; //5 BINARIO
		int i4 = 0xE; //14 HEXADECIMAL
		int i5 = 070; //56 OCTAL
		System.out.println(i5);
		
		int decimalNumber = 25;
		String binaryString = Integer.toBinaryString(decimalNumber);
		System.out.println(binaryString); // Output: 11001
	}

}

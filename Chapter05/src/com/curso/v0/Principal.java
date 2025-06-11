package com.curso.v0;

public class Principal {
	
	static public void print(byte x) { //1
		System.out.println("byte-");
	}
	
	static public void print(int x) {  //2
		System.out.println("int-");
	}
	
	static public void print(int... x) { //6
		System.out.println("varargs-");
	}
	
	static public void print(long x) {  //3
		System.out.println("long-");
	}
	
	static public void print(Byte x) { //4
		System.out.println("Byte-");
	}
	
	static public void print(Integer x) {
		System.out.println("Integer-");
	}
	
	static public void print(Long x) {
		System.out.println("Long-");
	}
	
	static public void print(Object x) { //5
		System.out.println("Object-");
	}

	public static void main(String[] args) {
		byte b = 1;
		print(b);
		
	}

}

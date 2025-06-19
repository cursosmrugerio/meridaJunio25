package com.curso.v1;

public class StaticNested {
	
	static int data=5;
	
	//Static Nested Class
	static class Animal{
		String name;
		public Animal(String name) {
			this.name = name;
		}
	}

	public static void main(String[] args) {
		
		System.out.println(StaticNested.data);
		
		Animal a = new StaticNested.Animal("Pato");
		System.out.println(a.name);
		
		
	}

}

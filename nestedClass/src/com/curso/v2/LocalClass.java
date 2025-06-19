package com.curso.v2;

public class LocalClass {
	
	public static void main(String[] args) {
		
		int data=5;
		System.out.println(data);
		
		//Local Class
		class Animal{
			String name;
			public Animal(String name) {
				this.name = name;
			}
		}		
	
		Animal a = new Animal("Pato");
		System.out.println(a.name);
		
	}

}

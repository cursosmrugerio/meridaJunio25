package com.curso.v0;

public class InnerClass {
	
	int data=5;
	
	//InnerClass
	class Animal{
		String name;
		public Animal(String name) {
			this.name = name;
		}
	}

	public static void main(String[] args) {
		
		System.out.println(new InnerClass().data);
		
		//InnerClass.Animal a = new InnerClass().new Animal("Pato");
		Animal a = new InnerClass().new Animal("Pato");
		System.out.println(a.name);
		
		
	}

}

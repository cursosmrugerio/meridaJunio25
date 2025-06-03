package com.curso.v0;


public class Salmon {
	int count; //VALOR 4
	{
		System.out.print(count + "-");//2
	}
	{
		count++;
	}

	public Salmon() {
		count = 4;
		System.out.print(2 + "-"); //3
	}

	public static void main(String[] args) {
		System.out.print(7 + "-"); //1
		Salmon s = new Salmon();
		System.out.print(s.count + "-");
	}
} //7-0-2-4-

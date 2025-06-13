package com.curso.v2;

class MyException extends Exception{
}

class Animal{
	Animal() throws MyException {
		super();
	}
}

class Pato extends Animal{
	Pato() throws Exception {
		super();
	}
}

class Leon extends Animal{
	Leon() throws UnsupportedOperationException,
					NullPointerException, MyException {
		
	}
}

public class Question09 {

	public static void main(String[] args) {

	}

}

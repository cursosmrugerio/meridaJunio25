package com.curso.v0;

class MyException extends Exception{
}

class Animal{
	void comer() throws MyException {
	}
}

class Pato extends Animal{
	@Override
	void comer() throws MyException {
	}
}

class Leon extends Animal{
	@Override
	void comer() throws UnsupportedOperationException,
					NullPointerException {
	}
}

public class Question09 {

	public static void main(String[] args) {

	}

}

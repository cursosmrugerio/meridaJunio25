package com.curso.v0;

public interface Operacion { //abstract
	//abstract public
	int ejecuta(int x, int y);
}

class Suma implements Operacion{
	@Override
	public int ejecuta(int x, int y) {
		return x + y;
	}
}

class Resta implements Operacion{
	@Override
	public int ejecuta(int x, int y) {
		return x - y;
	}
}

class Multi implements Operacion{
	@Override
	public int ejecuta(int x, int y) {
		return x * y;
	}
}

class Potencia implements Operacion{
	@Override
	public int ejecuta(int x, int y) {
		return (int)Math.pow(x, y);
	}
}



package com.curso.v1;

class Ave{
	String tipo;
	int edad;
	Ave(String tipo){
		this.tipo = tipo;
	}
	Ave(String tipo,int edad){
		this.tipo = tipo;
		this.edad = edad;
	}
}
class Aguila extends Ave {
	Aguila(){
		super("Aguila",5);
	}
}

class Pato extends Ave{
	Pato( String tipo){
		super(tipo);
	}
}

public class PrincipalConstructorSuper {

	public static void main(String[] args) {

	}

}

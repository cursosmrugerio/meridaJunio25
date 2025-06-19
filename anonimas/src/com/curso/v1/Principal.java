package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		System.out.println("V1 Interface");
		int res = 0;

		//CLASES ANONIMAS => LAMBDAS
		Operacion ope1 = new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				System.out.println("Suma");
				return x+y;
			}
		};
		res = ope1.ejecuta(8,4);
		System.out.println(res);
		
		
		Operacion ope2 =  new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				System.out.println("Resta");
				return x - y;
			}
		};
		res = ope2.ejecuta(8,4);
		System.out.println(res);
		
		Operacion ope3 = new Operacion() {
			@Override
			public int ejecuta(int pato1, int pato2) {
				System.out.println("Multi");
				return pato1 * pato2;
			}
		};
		res = ope3.ejecuta(8,4);
		System.out.println(res);

		Operacion ope4 = new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				System.out.println("Potencia");
				return (int)Math.pow(x, y);
			}
		};
		res = ope4.ejecuta(8,4);
		System.out.println(res);
		
	}

}

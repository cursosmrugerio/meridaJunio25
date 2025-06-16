package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		System.out.println("V1 Interface");
		int res = 0;

		//CLASES ANONIMAS => Lambdas
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
		System.out.println(ope2.getClass().getSimpleName());
		res = ope2.ejecuta(8,4);
		System.out.println(res);
		
		Operacion ope3 = new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				System.out.println("Multi");
				return x * y;
			}
		};
		System.out.println(ope3.getClass().getSimpleName());
		res = ope3.ejecuta(8,4);
		System.out.println(res);

		Operacion ope4 = new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				System.out.println("Potencia");
				return (int)Math.pow(x, y);
			}
		};
		System.out.println(ope4.getClass().getSimpleName());
		res = ope4.ejecuta(8,4);
		System.out.println(res);
		
	}

}

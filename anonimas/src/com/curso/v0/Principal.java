package com.curso.v0;

public class Principal {

	public static void main(String[] args) {
		
		int res = 0;

		Operacion ope1 = new Suma();
		System.out.println(ope1.getClass().getSimpleName());
		res = ope1.ejecuta(8,4);
		System.out.println(res);
		
		Operacion ope2 = new Resta();
		System.out.println(ope2.getClass().getSimpleName());
		res = ope2.ejecuta(8,4);
		System.out.println(res);
		
		Operacion ope3 = new Multi();
		System.out.println(ope3.getClass().getSimpleName());
		res = ope3.ejecuta(8,4);
		System.out.println(res);

		Operacion ope4 = new Potencia();
		System.out.println(ope4.getClass().getSimpleName());
		res = ope4.ejecuta(8,4);
		System.out.println(res);
		
	}

}

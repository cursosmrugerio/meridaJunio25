package com.curso.v4;

public class Principal {

	public static void main(String[] args) {
		System.out.println("V4 Lambda");
		int res = 0;

		//LAMBDAS
		Operacion ope1 = (x,y) -> x + y;
		res = ope1.ejecuta(8,4);
		System.out.println(res);
		
		Operacion ope2 = (w,z) -> w - z;
		res = ope2.ejecuta(8,4);
		System.out.println(res);
		
		Operacion ope3 = (pato1,pato2) -> pato1 * pato2;
		res = ope3.ejecuta(8,4);
		System.out.println(res);

		Operacion ope4 = (data1,data2) -> (int)Math.pow(data1, data2);	
		res = ope4.ejecuta(8,4);
		System.out.println(res);
		
		Operacion ope5 = (t,u) -> t/u;	
		res = ope5.ejecuta(8,4);
		System.out.println(res);
		
	}

}

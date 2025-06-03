package com.curso.v0;

public class Question09 {
	
	//VARIABLES INSTANCIA O STATIC SI SE INICIALIZAN
	float f ; //0.0
	double d ; //0.0
	char ch ; //Empty character
	
	//VARIABLES DE CLASE SON LO MISMO QUE VARIABLES static
	String cadena;
	
	public static void main(String[] args) {
		System.out.println(new Question09().cadena);
		
		//VARIABLES LOCALES NO SE INICIALIZAN
		double d2 = 0;
		//System.out.println(d2); 
	}

}

package com.curso.v0;

public class Question18 {

	public static void main(String[] args) {

		String s1 = """ 
				purr""";
		//System.out.println(s1); //purr
		
		s1.toUpperCase();
		s1.trim();
		s1.substring(1, 3);
		s1 += "two"; //<==SI APLICA
		
		System.out.println(s1); //purrtwo
		
		System.out.println(s1.length()); //7
		
		String s2 = "";
		s2 += 2; 
		s2 += 'c'; 
		s2 += false; //NO SE GUARDA EN EL POOL DE STRINGS
		
		System.out.println(s2); //2cfalse
		System.out.println(s2=="2cfalse"); //false
		if ( s2 == "2cfalse") System.out.println("==");
		
		if ( s2.equals("2cfalse")) System.out.println("equals");

		
		
		
	}

}

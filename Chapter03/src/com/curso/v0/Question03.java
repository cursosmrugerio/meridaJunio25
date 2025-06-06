package com.curso.v0;

import java.util.*;

public class Question03 {
	
	public static void main(String[] args) {
		Double[][] doubles = {{1.0,2.0},{3.0,4.0}};
		
		for (Double[] arreglo:doubles)
			System.out.println(Arrays.toString(arreglo));
		
//		Object o = new Object();
//		for (   :o)
		
//		Map<String,Integer> mapa = new HashMap<>();
//		for (   :mapa)
		
		List<Integer> lista = List.of(1,2,3,4);
		for (int i: lista)
			System.out.println(i);
		
//		String cadena = "HELLO";
//		for ( :cadena)
		
		Set<String> set = Set.of("11","22","33");
		for (String s : set){
			System.out.println(s);
		}
		
		
	}

}

package com.curso.v0;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		List<Object> listaObj = new ArrayList<>(
				List.of(new Object(),
						"Hola",
						Integer.valueOf(5)));
		
		transforma(listaObj);
		
		List<String> listaString = new ArrayList<>(
				List.of("Java",
						"Php",
						"JavaScript"));
		
		transforma(listaString);
		
	}

	private static void transforma(List<?> listaObj) {
		System.out.println("ENTRO");
	}

}

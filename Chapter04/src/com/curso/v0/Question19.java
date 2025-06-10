package com.curso.v0;

import java.util.Arrays;

public class Question19 {

	public static void main(String[] args) {
		
		// a > A > 0 > null

		String[] s1 = { "Camel", "Peacock", "Llama"};

		String[] s2 = { "Camel", "Llama", "Peacock"};

		String[] s3 = { "Camel"};

		String[] s4 = { "Camel", null};

		//                                P(80) L(76)
		//System.out.println(Arrays.compare(s1, s2)); //NUMERO POSITIVO
		
		//System.out.println(Arrays.compare(s3, s4)); //NUMERO NEGATIVO
		
		//System.out.println(Arrays.compare(s4, s4)); //0
		
		System.out.println(Arrays.mismatch(s3, s4)); // 1
		
		//System.out.println(Arrays.mismatch(s1, s2)); //1
		
		//System.out.println(Arrays.mismatch(s4, s4)); //-1
	}

}

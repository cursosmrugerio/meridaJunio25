package com.curso.v0;

import java.util.Arrays;

public class Question09 {

	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		int[] b = {1,2,3};
		
		System.out.println(a.equals(b)); //false
		
		System.out.println(Arrays.equals(a,b)); //true
		
	}

}

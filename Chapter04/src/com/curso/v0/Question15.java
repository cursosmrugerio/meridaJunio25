package com.curso.v0;

import java.util.Arrays;

public class Question15 {

	public static void main(String[] args) {

		String[] arr = new String[] { "PIG", "pig", "123"}; 
		Arrays.sort(arr); 
		System.out.println(Arrays.toString(arr)); //123, PIG, pig
		
		System.out.println(Arrays.binarySearch(arr, "Pippa")); //-4
		
	}

}

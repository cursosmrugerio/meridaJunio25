package com.curso.v0;

import java.util.Arrays;

public class Question02 {

	public static void main(String[] args) {
		
		int[] scores00  = new int[1];
		scores00[0] = 9;
		System.out.println(scores00);

		int[] scores0  = new int[3];
		int[] scores1  = {1,2,3};
		int[] scores2  = new int[]{1,2,3};
		
		scores2[1] = 99;
		
		System.out.println("scores2: "+Arrays.toString(scores2));
		
		int[][] scores3 = new int[5][];
		int[][] scores4 = {{1},{1,2},{1,2,3},{},{5,6,7,8,9}};
		
		System.out.println("scores4.length: "+scores4.length);
		System.out.println("scores4[2].length: "+scores4[2].length);
		
		scores3 = scores4;
		
		int[][][][] scores5 = new int[5][][][];
		
		Object[][][] cubbies = new Object[3][0][5];
		
		java.util.Date[] dates[] = new java.util.Date[2][];
		
		int[] unidimencioal, bidimencional[];
		
		
		
		
	}

}

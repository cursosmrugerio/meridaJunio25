package com.curso.v0;

public class Question21 {

	public static void main(String[] args) {

		int myFavoriteNumber = 8;
		int bird = ~myFavoriteNumber; //-9
		System.out.println("bird: "+bird);

		int plane = -myFavoriteNumber;
		System.out.println("plane: "+plane); //-8

		int superman = bird == plane ? 5 : 10; //10
		
		System.out.println("superman: "+superman);
		
		//
		System.out.println(bird + "," + plane + "," + --superman);
	}

}

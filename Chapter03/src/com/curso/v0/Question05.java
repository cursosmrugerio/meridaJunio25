package com.curso.v0;

import java.util.*;

public class Question05 {

	public static void main(String[] args) {

		List<Integer> myFavoriteNumbers = new ArrayList<>();

		myFavoriteNumbers.add(10);
		myFavoriteNumbers.add(14);
		for (Integer a : myFavoriteNumbers) {

			System.out.print(a + ", ");

			break;
		}

		for (int b : myFavoriteNumbers) {
			//continue;
			System.out.print(b + ", ");
		}

		for (Object c : myFavoriteNumbers)
			System.out.print(c + ", ");
	}

}

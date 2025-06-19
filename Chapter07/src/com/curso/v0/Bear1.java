package com.curso.v0;

public class Bear1 {

	enum FOOD {
		BERRIES, INSECTS {
			@Override
			public boolean isHealthy() {
				return false;
			}
		},
		FISH, ROOTS, COOKIES, HONEY;

		public boolean isHealthy() {
			return true;
		}
	}

	public static void main(String[] args) {
		System.out.println(FOOD.INSECTS); //INSECTS
		System.out.println(FOOD.INSECTS.ordinal()); //1
		System.out.println(FOOD.INSECTS.isHealthy()); //false
		System.out.println(FOOD.COOKIES.isHealthy()); //true
	}

}

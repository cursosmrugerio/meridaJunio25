package com.curso.v0;

abstract class Snake {
}

class Cobra extends Snake {
}

class GardenSnake extends Cobra {
}

public class SnakeHandler {

	private Snake snakey;

	public void setSnake(Snake mySnake) {
		this.snakey = mySnake;
	}

	public static void main(String[] args) {
		
		//Object o = new Snake();

		new SnakeHandler().setSnake(null);
		
		System.out.println(new SnakeHandler().snakey); //null

	}
}
package com.curso.v0;

public class RopeSwing2 {
	
	private final String leftRope;
	private final String rightRope;
	private final String bench;
	private final String name = "name";
	
	{
		leftRope = "left";
		rightRope = "right";
	}
	
	{
		//name = "name";
		//rightRope = "right";
		//bench = "x";
	}
	
	RopeSwing2(){
		bench = "x";
	}

	public static void main(String[] args) {
		//bench = "bench";
		System.out.println(new RopeSwing2().bench);
	}
}

package com.curso.v0;

public class Question21 {

	public static void main(String[] args) {

		StringBuilder puzzle = new StringBuilder("Java");
		
		//puzzle.reverse();
		
		//                               JavavaJ$
		//System.out.println(puzzle.append("vaJ$").substring(3, 7));
		//                               JavavaJ$      avaJ$                 
		System.out.println(puzzle.append("vaJ$").delete(0, 3)
				
				              //5-1 = 4  //avaJ
				.deleteCharAt(puzzle.length()-1));
	}

}

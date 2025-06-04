package com.curso.v0;

public class Question13 {

	public static void main(String[] args) {
		boolean sunny = true, raining = false, sunday = true;
		//                                       true
		//                             false         true
		boolean goingToTheStore = sunny & raining ^ sunday; //
		System.out.println("goingToTheStore: "+goingToTheStore);
		
		//                       true  &&   true
		boolean goingToTheZoo = sunday && !raining;
		System.out.println("goingToTheZoo: "+goingToTheZoo);
		
		//                    !(    true        &&      true    )
		boolean stayingHome = !(goingToTheStore && goingToTheZoo);
		System.out.println("stayingHome: "+stayingHome);


	}

}

package com.curso.v0;

public class Question02 {

	public static void main(String[] args) {
		int temperature = 4;
		long humidity = -temperature + temperature * 3; //8
		if (temperature>=4) 
			if (humidity < 6) 
				System.out.println("Too Low"); 
			else 
				System.out.println("Just Right"); //<=== 
		else System.out.println("Too High");
	}

}

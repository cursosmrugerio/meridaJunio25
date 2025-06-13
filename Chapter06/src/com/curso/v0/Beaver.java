package com.curso.v0;

class Rodent {
	public Rodent(Integer x) {}
	protected static Number chew() throws Exception {
		System.out.println("Rodent is chewing");
		return 1;
	}
}

public class Beaver extends Rodent{
	
	public Beaver() {
		super(1);
	}
	
	public static Integer chew() throws RuntimeException { 
		System.out.println("Beaver is chewing on wood"); 
		return 2;  
	}

}

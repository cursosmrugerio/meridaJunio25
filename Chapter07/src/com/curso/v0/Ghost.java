package com.curso.v0;

public class Ghost {

	public static void boo() {
		System.out.println("Not scared");
	}

	//INNER CLASS
	protected class Spirit {
		public void boo() {
			System.out.println("Booo!!!");
		}
	}
	
	public static void main(String[] args) {
		Ghost.Spirit g = new Ghost().new Spirit(){};
		g.boo(); //"Booo!!!"
		Ghost.boo();
		
//		Ghost.Spirit g = new Ghost().new Spirit();
//		g.boo(); //"Booo!!!"
//		Ghost.boo(); //"Not scared"
	}

}

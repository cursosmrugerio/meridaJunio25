package com.curso.v2;
class Ave{
	void volarAve(){
		System.out.println("volarAve");
	}
//	void volarAguila(){
//		System.out.println("volarAveAguila");
//	}
}
class Aguila extends Ave{
	void volarAguila(){
		System.out.println("volarAguila");
	}
}
public class Principal {
	public static void main(String[] args) {
		Ave ave = new Aguila();
		//ave.volarAguila(); 
		((Aguila)ave).volarAguila(); 
	}

}

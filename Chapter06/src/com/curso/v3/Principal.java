package com.curso.v3;
class Ave{
	String tipoAve = "Ave";
	String tipoAguila = "AveAguila";
}
class Aguila extends Ave{
	String tipoAguila = "Aguila";
}
public class Principal {
	public static void main(String[] args) {
		Ave ave = new Aguila();
		System.out.println(ave.tipoAve);
		System.out.println(ave.tipoAguila);
		System.out.println(((Aguila)ave).tipoAguila);

	}

}

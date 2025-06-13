package com.curso.v0;

public class Question03 {
	void saludar(String a, int x) {
	}

	StringBuilder saludar(int x, String a) {
		return null;
	}
	
	Number calcular(int x) {
		return null;
	}
	
	static CharSequence show(int y) {
		return null;
	}
}
//LA FIRMA DE UN METODO "NO" CONSIDERA EL VALOR DE RETORNO
//LA FIRMA ESTA COMPUESTA POR
// - Nombre método
// - Parametro(s)
class Question03A extends Question03{
	@Override
	Integer calcular(int x) { //COVARIANZA
		return null;
	}
	//HIDDEN
	static String show(int y) {
		return null;
	}
	
}

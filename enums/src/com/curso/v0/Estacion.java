package com.curso.v0;

public enum Estacion {
	
	PRIMAVERA{
		@Override
		void mostrar() {
			System.out.println("Mostrar Primavera");
		}
	},
	OTOÑO{
		@Override
		void mostrar() {
			System.out.println("Mostrar Otoño");
		}
	},
	VERANO{
		@Override
		void mostrar() {
			System.out.println("Mostrar Verano");
		}
	},
	INVIERNO{
		@Override
		void mostrar() {
			System.out.println("Mostrar Invierno");
		}
	},;
	
	static int variableStatic;
	int variableInstancia;

	
	public static void main(String... args) {
		show();
		Estacion.INVIERNO.mostrar();
	}
	
	static void show() {
		System.out.println("Hola Mundo");
	}
	
	abstract void mostrar();

}

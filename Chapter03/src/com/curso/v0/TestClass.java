package com.curso.v0;


public class TestClass {
	
	enum DayOfWeek{
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	}
	
	public static void main(String[] args) {
		DayOfWeek day = DayOfWeek.FRIDAY;
		
		switch (day) {
		case MONDAY:
			TUESDAY: //LABEL
			WEDNESDAY: //LABEL
			THURSDAY: //LABEL
			PATITO:
			FRIDAY: //LABEL
				System.out.println("working");
		case SATURDAY:
			SUNDAY: //LABEL
				System.out.println("off");
		}
		
		System.out.println("Fin de Programa");
	}
}
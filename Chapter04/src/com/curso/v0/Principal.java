package com.curso.v0;
import java.time.*;

public class Principal {

	public static void main(String[] args) {
		
		String cadena = "hello";
		
		cadena = cadena.concat(" world");
		
		System.out.println(cadena);
		
		
		System.out.println("************");

		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
		
		System.out.println("************");
		
		LocalDate date = LocalDate.of(2022, Month.JANUARY, 20);
		
		date = date.plusDays(2);
		System.out.println(date);
		
		date = date.plusWeeks(1);
		System.out.println(date);
		
		date = date.plusMonths(1);
		System.out.println(date);

		date = date.plusYears(5);
		System.out.println(date);
		
		System.out.println("************");
		
		//LocalDate
		date = LocalDate.of(2022, Month.JANUARY, 20);
		
		//SE CREAN 4 OBJETOS
		System.out.println(date.plusYears(5)
							   .plusWeeks(1)
							   .plusDays(2)
							   .plusMonths(1)
							   );
		
		
		

	}

}

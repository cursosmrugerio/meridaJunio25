package com.curso.v0;

import java.time.*;

public class PrincipalPeriod {

	public static void main(String[] args) {
		
		LocalDate start = LocalDate.of(2022, Month.JANUARY, 1);
		LocalDate end   = LocalDate.of(2022, Month.MARCH,  30);
		
		Period period = Period.ofMonths(1); 
		
		performAnimalEnrichment(start, end, period);
	}

	private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) { 
		LocalDate upTo = start;
		
		while (upTo.isBefore(end)) {
			System.out.println("************");
			System.out.println(upTo);
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plus(period);
		}
		
		System.out.println("***********");
		
		//SOLO EXISTE UN OBJECTO, EL DE LA ULTIMA LLAMADA
		Period otherPeriod = Period.ofYears(1)
								   .ofDays(5)
								   .ofWeeks(1)
								   .ofDays(1);
		
		Period otroPeriod = Period.ofYears(1);
		otroPeriod = Period.ofDays(5);
		otroPeriod = Period.ofWeeks(5);
		otroPeriod = Period.ofDays(5);
		
		LocalDate today = LocalDate.now(); //2025 06 09
		
		System.out.println("Hoy: "+today);
		
		System.out.println(today.plus(otherPeriod)); //2025-06-16
		
	}

}

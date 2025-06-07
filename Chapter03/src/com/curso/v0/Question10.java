package com.curso.v0;


public class Question10 {
	
	enum DayOfWeek {
		MONDAY,
		THURSDAY,
		SUNDAY,
		FRIDAY
	}


	public static void main(String[] args) {

	}
	
	private DayOfWeek getWeekDay(int day, final int thursday) {
		
		int otherDay = day;
		
		final int Sunday = 0;
		
		switch(otherDay) {
		
			case 1: ;
			
			case Sunday: return DayOfWeek.SUNDAY;
			
			//case thursday: return DayOfWeek.THURSDAY;
			
			//case DayOfWeek.MONDAY: return DayOfWeek.MONDAY;
		
		}
		
		return DayOfWeek.FRIDAY; 
	}

}

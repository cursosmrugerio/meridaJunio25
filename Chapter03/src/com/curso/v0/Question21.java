package com.curso.v0;

public class Question21 {

	public static void main(String[] args) {
		long l1 = 100;
		Long l2 = 100L;
		findZookeeper(100l);
	}

	static void findZookeeper(Long id) {
		
		int intId = (int)(long)id;
		
		System.out.print(switch (intId) {
		case 10 -> {yield "Jane";}
		case 20 -> {yield "Lisa";}
		case 30 -> "Kelly";
		//case 30 -> "Sarah";
		default -> "Unassigned";
		});
	}

}

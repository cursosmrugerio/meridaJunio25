package com.curso.v0;

public class Question22 {

	public static void main(String[] args) {
		findZookeeper(true);
		findZookeeperTwo(100L);
	}

/*
 * As a side note, there’s a preview feature in Java 17 and Java 18 that 
 * expands the syntax, behavior, and acceptable argument types for switch 
 * significantly. Notably, you will be permitted to switch on arbitrary object 
 * types; however, at the time of writing, even though it’s permitted to 
 * switch on a wrapper such as a Double or Boolean, it remains prohibited to 
 * switch on the corresponding primitive types, and autoboxing happens. 
 * (Of course, this describes a preview feature that’s not relevant for 
 * the Java 17 exam, and it’s possible the details will change before the 
 * final release.) https://blogs.oracle.com/javamagazine/post/java-switch-primitive-types
 */
	static void findZookeeper(Boolean id) {
		System.out.println(switch (id) {
			default -> "Unassigned Boolean";
		});
	}
	
	static void findZookeeperTwo(Long id) {
		switch (id) {
			default : System.out.println("Unassigned Long");
		}
	}
	
	

}

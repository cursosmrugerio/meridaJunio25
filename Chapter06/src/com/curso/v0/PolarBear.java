package com.curso.v0;

public class PolarBear {
StringBuilder value = new StringBuilder ("t");
{ value. append ("a"); } 
{ value. append ("с"); }
private PolarBear() {
	value.append ("b") ;
}
public PolarBear(String s) {
	this();
	value.append(s) ;
}
public PolarBear (CharSequence p) {
	this(p.toString());
	value.append(p);
}
public static void main (String[] args) {
	Object bear = new PolarBear (); //value = tacb 
	bear = new PolarBear("f");     //value = tacbf
	bear = new PolarBear(new StringBuilder("x")); //value = tacbxx
	System.out.println (((PolarBear)bear).value);
}}
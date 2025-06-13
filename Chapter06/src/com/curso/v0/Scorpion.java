package com.curso.v0;

class Arachnid {
    static StringBuilder sb = new StringBuilder();
    { sb.append("c"); } //uqc     //uqcrc
    static
    { sb.append("u"); }
    { sb.append("r"); } //uqcr    //uqcrcr
}
//uq
public class Scorpion extends Arachnid {
    static
    { sb.append("q"); }
    { sb.append("m"); } //uqcrcrm
    public static void main(String[] args) {
    	  System.out.print(Scorpion.sb + " "); //uq 
          System.out.print(Scorpion.sb + " "); //uq
          new Arachnid(); 
          new Scorpion();
    	  System.out.print(Scorpion.sb); //uqcrcrm
    }
}
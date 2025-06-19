package com.curso.v0;

class Primate {
	
    public Primate() { //3
    	this.age = 3;
    }
    
    protected int age = 2; //2
	
    {
        age = 1; //1
    }
 
}


public class Orangutan extends Primate {
    protected int age = 4;

    {
        age = 5;
    }
    
    public Orangutan() {
    	this.age = 6;
    }
    
    public static void main(String[] bananas) {
    	
    	final Primate x = (Primate)new Orangutan();
    	System.out.println(x.age); //1
    	System.out.println(((Orangutan)x).age); //6
    	
    }

}

package com.curso.v0;

class Person {
    static String name; //Sophia
    void setName(String q) { name = q; }
}

public class Child extends Person {
    static String name; //Elysia //Webby //Olivia
    @Override
    void setName(String w) { name = w; }

    public static void main(String[] p) {
    	
        final Child m = new Child();
        final Person t = m;
        
        m.name = "Elysia"; //Child.name
        t.name = "Sophia"; //Person.name
        
        m.setName("Webby");
        t.setName("Olivia");
        
        System.out.println(Child.name);
        System.out.println(Person.name);
        
        //                 Olivia         Sophia
        System.out.println(m.name + " " + t.name);
    }
}

package com.curso.v1;

class PoliceBox {
    String color; //null //default
    long age; //0 //default
   
    //NO ES UN CONSTRUCTOR
    public void PoliceBox() { 
        color = "blue";
        age = 1200;
    }
}

public class Main {
    public static void main(String[] time) {
    	PoliceBox p = new PoliceBox();
    	PoliceBox q = new PoliceBox();
        p.color = "green";
        p.age = 1400;
        p = q;
        System.out.println("Q1=" + q.color); //null
        System.out.println("Q2=" + q.age); //0
        System.out.println("P1=" + p.color); //null
        System.out.println("P2=" + p.age); //0
    }
}
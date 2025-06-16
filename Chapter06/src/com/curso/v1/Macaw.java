package com.curso.v1;

class Bird {
    int feathers = 0; //4
    Bird(int x) { this.feathers = x; }
    Bird fly() {
        return new Bird(1);
    }
}

class Parrot extends Bird {
    protected Parrot(int y) { super(y); }
    protected Parrot fly() {
        return new Parrot(2);
    }
}

public class Macaw extends Parrot {
    public Macaw(int z) { super(z); }
    
//    public Macaw fly() {
//        return new Macaw(3); //3
//    }
    
    public Macaw fly() {
        return this;  //4
    }

    public static void main(String... sing) {
        Bird p = new Macaw(4);
        System.out.print(((Parrot)p.fly()).feathers);
        //System.out.print(p.fly().feathers); //4
        //System.out.print(p.fly().feathers); //3
    }
}

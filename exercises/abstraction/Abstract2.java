package com.exercises.abstraction;

abstract class AA{               // abstract class
    abstract void show();         //abstract method for AA
}
abstract class BB extends AA{       //abstract class BB extends AA
    abstract void display();        // abstract method for BB
}
class CC extends BB{         //normal class extends abstract class BB
    void show(){
        System.out.println("Class AA");
    }
    void display(){
        System.out.println("Class BB");
    }
}
class Abstract2 {
    public static void main(String[] args) {
        System.out.println("ABSTRACTION EXAMPLE 4:");
        CC Cex = new CC();            //obj creation
        Cex.show();
        Cex.display();
    }
}

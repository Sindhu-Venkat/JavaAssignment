package com.exercises.abstraction;

abstract class A2 {               // abstarct class

    void display(){               // non abstract method
        System.out.println("Non abstract method 1");
    }
}
class B2 extends A2{            //derived class extends base class
    void show(){
        System.out.println("Non abstract method 2");
    }
}
class Main2{
    public static void main(String[] args) {
        System.out.println("ABSTRACTION EXAMPLE 2:");
        B2 bex2 = new B2();      // obj creation for derived class
        bex2.display();
        bex2.show();
    }
}
package com.exercises.abstraction;

abstract class A {                 // base class(abstract class)
    abstract void display();       // abstract method
}

class B extends A {            //derived class extends base class
    void display() {
        System.out.println("Derived class method from Base class");
    }
}
    class Main {
        public static void main(String[] args) {
            System.out.println("ABSTRACTION EXAMPLE 1:");
            B bex = new B();      // obj creation for derived class
            bex.display();

        }
    }



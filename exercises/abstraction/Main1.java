package com.exercises.abstraction;

abstract class Horse1 {                 // base class(abstract class)
    abstract void sound(); // abstract method

}

abstract class Horse2 extends Horse1 { //derived class extends base class
    void display() {
        System.out.println("Derived class method from Base class");
    }
    void sound(){
        System.out.println("HORSE SOUNDS:");
    }
}
    class Main {
        public static void main(String[] args) {
            System.out.println("ABSTRACTION EXAMPLE 1:");

        }
    }



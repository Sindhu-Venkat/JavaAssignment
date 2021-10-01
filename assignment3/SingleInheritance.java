package com.assignment3;

class ParentClass {        //parent class

    int a = 5;       //instance variable
    static int b = 10;    // static variable

    void multiply() {         //instance method
        System.out.println("Parent class Instance Method");
        int c;      // local variable
        c = a * b;
        System.out.println("Parent Class Multiplication : " + c);
        System.out.println(a + " * " + b + " = " + c);
    }

    static void add() {       // static method
        System.out.println("Parent Class Static Method");
        int c;  //local variable
        ParentClass p1 = new ParentClass();
        c = p1.a + b;
        System.out.println("Parent Class Addition :" + c);
        System.out.println(p1.a + "  + " + b + " = " + c);
    }

    {
        System.out.println("PARENT CLASS INSTANCE BLOCK");   //instance block
    }

    static {
        System.out.println("PARENT CLASS STATIC BLOCK");    //static block
    }

    ParentClass() {
        System.out.println("PARENT CLASS CONSTRUCTOR");     // constructor
    }
}

class ChildClass extends ParentClass {     // child class

    int a = 100;      // instance variable
    static int b = 200;  // static variable


    void multiply1() {      //instance method
        super.multiply();
        System.out.println("Child Class Instance Method");
        int c;  // local variable
        c = a * b;
        System.out.println("Child Class Multiplication :" + c);
        System.out.println(a + " * " + b + " = " + c);
    }

    static void add1() {    //static method
        System.out.println("Child Class Static Method");
        int c;
        ChildClass a1 = new ChildClass();
        c = a1.a + b;
        System.out.println("Child Class Addition :" + c);
        System.out.println(a1.a + "  + " + b + " = " + c);
    }

    {
        System.out.println("CHILD CLASS INSTANCE BLOCK");
    }

    static {
        System.out.println("CHILD CLASS STATIC BLOCK");
    }

    ChildClass() {
        System.out.println("CHILD CLASS CONSTRUCTOR");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        ChildClass a2 = new ChildClass();
        a2.multiply1();
        ChildClass.add1();
    }

}
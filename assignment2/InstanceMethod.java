package com.assignment2;

public class InstanceMethod {

    int a;      //instance variable
    static int b;      //static variable

    void display(){      // instance method
        a = 500;
        b = 400;
        int c = 300;  //local variable
        System.out.println("Instance Method Values");
        System.out.println("a=" +a);
        System.out.println("b ="+b);
        System.out.println("c ="+ c);

    }
    static void dis(){      //static method
        System.out.println("Static Method Values");
        InstanceMethod I1 = new InstanceMethod();
        I1.a = 50;
        b = 40;
        int c = 30;  //local variable
        System.out.println("a ="+ I1.a);
        System.out.println("b="+ b);
        System.out.println("c=" + c);
    }

    public static void main(String[] args) {
        InstanceMethod I2 = new InstanceMethod();
        I2.display();
        InstanceMethod.dis();

    }
}


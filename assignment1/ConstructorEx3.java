package com.assignment1;

public class ConstructorEx3 {

    int a;       //Instance variable
    static int b;    //Static variable

    ConstructorEx3(){
        System.out.println("Constructor");

    }

    {
        System.out.println("INSTANCE BLOCK");
        int c = 600;   // local variable
        b = 500;
        a = 400;
        System.out.println("Instance Block value c =" + c);

    }

        void add1() {           //Instance Method
        System.out.println("Instance Method =" + a);
    }

        static void add2() {     //Static Method
        System.out.println("Static Method =" + b);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        ConstructorEx3 cEx3 = new ConstructorEx3();
        cEx3.add1();
        cEx3.add2();

    }
}

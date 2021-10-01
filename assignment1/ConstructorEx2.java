package com.assignment1;

public class ConstructorEx2 {

    int a;      //instance variable
    static int b;   //static variable

    ConstructorEx2() {
        a = 300;
        b = 400;
    }
    void instance() {
        System.out.println("Instance Method =" + a);
    }
    static void stat() {
        ConstructorEx2 cEx2 = new ConstructorEx2();
        System.out.println("Static Method =" + b);
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        ConstructorEx2 cEx2 = new ConstructorEx2();
        cEx2.instance();
        stat();
    }
}


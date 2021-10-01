package com.assignment4;

public class InstanceMethod2 {

    void instancemethod(){
        System.out.println("INSTANCE METHOD");
        int a = 100;
        int b = 200;
        int c;
        c= a+b;
        System.out.println("A =" +a);
        System.out.println("B =" +b);
        System.out.println("C =" +c);
        InstanceMethod2.statmethod();
    }

    static void statmethod(){
        System.out.println("STATIC METHOD");
        int a = 2;
        int b = 4;
        int c;
        c = a*b;
        System.out.println("A ="+a);
        System.out.println("B= "+b);
        System.out.println("C ="+c);
    }

    public static void main(String[] args) {
        InstanceMethod2 I2 = new InstanceMethod2();
        I2.instancemethod();

    }
}

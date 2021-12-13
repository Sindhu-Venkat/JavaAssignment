package com.exercises.methods;

public class Methods {

    int a=100;       //instance variable
    static int b=200;  //static variable

    void instance(){       // instance method
        System.out.println("INSTANCE METHOD");
        int c=300;   //local variable
        System.out.println("c="+c);
        System.out.println("a="+a);
        System.out.println("b="+b);

    }

    static void stat(){           // static method
        System.out.println("STATIC METHOD");
        int c = 600;      //local variable
        System.out.println("c="+c);
        Methods mEx= new Methods();
        mEx.b=500;
        System.out.println("b="+b);


    }

    public static void main(String[] args) {
        System.out.println("HELLO");
        Methods mEx1 = new Methods();
        mEx1.instance();
        stat();
    }
}

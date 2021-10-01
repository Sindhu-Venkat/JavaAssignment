package com.assignment4;

public class ConstructorQ3 {

    int x;    // instance variable
    static int y;    //static variable

    ConstructorQ3(){
        int z;
        x = 8;
        y = 4;
        z = x*y;
        System.out.println(x + "*" + y+ "*" + "="+ z);
        add();
        sub();
    }


    void add(){ // instance method
        System.out.println("INSTANCE METHOD");  // local variable
    }

    static void sub(){
        System.out.println("STATIC METHOD");
    }


    public static void main(String[] args) {
        System.out.println("Hello");
        ConstructorQ3 c2 = new ConstructorQ3();

    }


}

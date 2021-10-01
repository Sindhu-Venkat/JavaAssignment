package com.assignment1;

public class ConstructorEx1 {

    int a = 10;    //instance variable
    static int b = 20;     // static variable

    ConstructorEx1(){
        int c =30;   //local variable
        System.out.println("Local Variable =" + c);
        System.out.println("Instance Variable=" + a);
        System.out.println("Static Variable=" +b);

    }

    public static void main(String[] args) {

        System.out.println("Hello");
        ConstructorEx1 cEx1 = new ConstructorEx1();

    }
}

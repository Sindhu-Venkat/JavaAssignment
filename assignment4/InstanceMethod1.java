package com.assignment4;

public class InstanceMethod1 {

    int a;

    void add1(){
        int a = 5;
        System.out.println("Method 1 =" + a);
    }

    void add2(){
        add1();
        int b = 10;
        System.out.println("Method 2 =" +b);
    }

    public static void main(String[] args) {
        InstanceMethod1 I1 = new InstanceMethod1();
        I1.add2();
    }
}

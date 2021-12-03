package com.exercises;

public class Add{      //method overloading

    public int add(int a,int b){
        System.out.println(a+b);
        return a+b;
    }

    public int add(int a,int b,int c){
        System.out.println(a+b+c);
        return a+b+c;
    }

    public static void main(String[] args) {
        Add ob = new Add();
        ob.add(10,15);
        ob.add(2,4,6);
    }
}
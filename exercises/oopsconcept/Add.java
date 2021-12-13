package com.exercises.oopsconcept;

public class Add{                       //method overloading

    public int add(int a,int b){
        return a+b;
    }

    public int add(int a,int b,int c){
        return a+b+c;

    }

    public static void main(String[] args) {
        Add ob = new Add();
        int addresult = ob.add(10,15);
        System.out.println(addresult);
        int finalResult = ob.add(2,4,addresult);
        System.out.println(finalResult);

    }
}
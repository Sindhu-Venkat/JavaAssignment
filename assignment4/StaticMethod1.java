package com.assignment4;

public class StaticMethod1 {

    static String name;
    static float dob;

static void method1(){
    System.out.println("METHOD 1");
    name = "GGG";
    dob =  2000;
    System.out.println("Student1 name : " +name);
    System.out.println("Student1 DOB : "+ dob);
}

static void method2(){
    method1();
    System.out.println("METHOD 2");
    name = "SSS";
    dob = 1999;
    System.out.println("Student2 name : " +name);
    System.out.println("Student2 DOB : "+ dob);
}

    public static void main(String[] args) {
        new StaticMethod1().method2();
    }
}

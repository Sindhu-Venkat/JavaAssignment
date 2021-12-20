package com.exercises.interfaces;

interface inparent{
    void m1();
    void m2();
    void m3();
}
abstract class interparent implements inparent{   //class to interface so using "implements" keyword
     public void m1(){
         int a = 10;
         int b = 20;
         int c = a + b;
         System.out.println("M1 C VALUE :"+ c);
     }
}
abstract class interparent1 extends interparent {   //class to class so using "extends" keyword
    public void m2(){
        double a = 22;
        double b = 44;
        double c = a/b;
        System.out.println("M2 C VALUE :"+ c);
    }
}
public class Example3 extends interparent1 {      // class to class so using "extends" keyword
    public void m3(){
        int a = 3;
        int b = 6;
        int c = a*b;
        System.out.println("M3 C VALUE :"+ c);
    }
    public static void main(String[] args) {
        System.out.println("INTERFACE EXAMPLE 3");

        Example3 ex3 = new Example3();
        ex3.m1();
        ex3.m2();
        ex3.m3();
    }
}

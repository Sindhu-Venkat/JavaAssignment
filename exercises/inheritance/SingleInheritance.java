package com.exercises.inheritance;

class GrandParent {             //parent class
    int a=2;
    int b=8;

    void student() {
        System.out.println("<---GRAND PARENT ---> ");
    }
}
class Parent extends GrandParent {           //child class
    public void student1() {
        int c;
        c = a+b;
        System.out.println("STUDENT VALUE C:" + c);
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        System.out.println("SINGLE INHERITANCE");
        GrandParent gp = new GrandParent();
        gp.student();
        Parent p = new Parent();
        p.student1();
    }
}

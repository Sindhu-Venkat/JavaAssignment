package com.exercises.inheritance;

class Animal{                 //parent class(super or base class)
    String name ;
    int legs;
}
class Dog extends Animal {            //child class(subclass)
    public void display(){
        name = "Cass";
        System.out.println("Dog's Name :"+name);
        int legs = 4;
        System.out.println("Legs:"+legs);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        System.out.println("INHERITANCE EXAMPLE");
        Dog d = new Dog();
        d.display();

    }
}

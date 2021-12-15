package com.exercises.abstraction;

abstract  class Bike {                     //abstract class
 Bike() {                    //base constructor
  System.out.println(" BASE Bike is created");
 }

 abstract void run(); //abstract method

 void wheels() {
  System.out.println(" Bike has two Wheels");
 }

 class Honda extends Bike {            //derived class extends base
  Honda() {                      // derived constructor
   System.out.println(" Derived Honda is created");
  }

  void run() {      //base method
   System.out.println("Base Bike is running safely ");
  }

  void display() {   //derived method
   System.out.println("Derived class method");
  }
 }
}
 class Constructor {
  public static void main(String[] args) {
   System.out.println("ABSTARCTION WITH CONSTRUCTORS:");

  }
}

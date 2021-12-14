package com.exercises.abstraction;

abstract  class Base {                     //abstract class
 Base() {                    //base constructor
  System.out.println("Base class constructor");
 }
 abstract void show(); //abstract method
}

class Derived extends Base{ //derived class extends base

 Derived(){                      // derived constructor
  System.out.println("Derived class constructor");
 }
 void show(){      //base method
  System.out.println("Base class method ");
 }
 void display(){   //derived method
  System.out.println("Derived class method");
 }
}

 class Constructor {
  public static void main(String[] args) {
   System.out.println("ABSTARCTION WITH CONSTRUCTORS:");
   Derived dex = new Derived();      //obj creation
   dex.show();
   dex.display();
  }
}

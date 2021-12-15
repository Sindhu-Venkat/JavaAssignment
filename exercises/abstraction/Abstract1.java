package com.exercises.abstraction;

abstract class Shape{           //abstract class 1
 abstract void draw();       //abstract method
}

abstract class triangle extends Shape{         //abstract class b1 extends a1
abstract void show();
}

abstract class Circle extends triangle {          //normal class extends abstract class b1
 void display(){
  System.out.println("Class TRIANGLE");
 }
}

 class Abstract1 {
  public static void main(String[] args) {
   System.out.println("ABSTRACTION EXAMPLE 3:");
  }
 }

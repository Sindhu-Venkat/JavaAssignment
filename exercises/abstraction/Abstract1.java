package com.exercises.abstraction;

abstract class A1{           //abstract class 1
 abstract void show();       //abstract method
}

abstract class B1 extends A1{         //abstract class b1 extends a1
void show(){
 System.out.println("Class A1");
}
}

class C extends B1{          //normal class extends abstract class b1
 void display(){
  System.out.println("Class B1");
 }
}

 class Abstract1 {
  public static void main(String[] args) {
   System.out.println("ABSTRACTION EXAMPLE 3:");
   C cex = new C();      //obj creation for normal class
   cex.show();
   cex.display();
  }
}

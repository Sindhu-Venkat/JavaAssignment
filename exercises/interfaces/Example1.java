package com.exercises.interfaces;

interface Animal {
      void animalsound();
      void sleep();
}
class Horse implements Animal {
     public void animalsound() {
          System.out.println("THE HORSE NEIGHS");
     }

     public void sleep() {
          System.out.println("HORSE SLEEPS ZZZZ");
     }
}
public class Example1 {
     public static void main(String[] args) {
          System.out.println("<---INTERFACE EXAMPLE 1--->");
          Horse h = new Horse();
          h.animalsound();
          h.sleep();

     }
     }


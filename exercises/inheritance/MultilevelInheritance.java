package com.exercises.inheritance;

class car {                              // Base class
    public car() {
        System.out.println("CLASS CAR");
    }
    public void vechiletype() {
        System.out.println("VECHILE TYPE : CAR");
    }
}
     class Alto extends car {           // derived class 1 extends base class
         public Alto() {
             System.out.println("CLASS ALTO");
         }
     }
     class Hyundai extends Alto{        // derived class 2 extends derived class 1
    public Hyundai(){
        System.out.println("CLASS HYUNDAI");
    }
    public void modeltype(){
        System.out.println("HYUNDAI MODEL : I 10 ");
    }
     }
public class MultilevelInheritance {
    public static void main(String[] args) {
        System.out.println("MULTILEVEL INHERITANCE");
        Hyundai h = new Hyundai();
        h.vechiletype();
        h.modeltype();

    }
}

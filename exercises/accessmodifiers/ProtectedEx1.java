package com.exercises.accessmodifiers;

class Fruits {

    protected void display() {                // protected
        System.out.println("FRUITS");
    }
}
    public class ProtectedEx1 extends Fruits {
        public static void main(String[] args) {
            System.out.println("PROTECTED EXAMPLE");
            ProtectedEx1 Pex1 = new ProtectedEx1();
            Pex1.display();     // same class protected method accessed
        }
    }


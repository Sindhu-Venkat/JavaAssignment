package com.exercises;

class Animal {
    int Animalcount = 2;

    public void animaltypes() {
        System.out.println("AnimalTypes:" + Animalcount);
    }
    class Dog {
        private int doglegs = 4;
        protected void Dog() {
            System.out.println("Dog Legs:" + doglegs);
        }
    }
    class Cat extends Dog{
            private int catlegs = 4;
            private void Cat() {
                System.out.println("Cat Legs:" + catlegs);
            }
        void show(){                //default
            System.out.println("DEFAULT MODIFIER2");
            Cat();
            Dog();
    }
    }
    }

public class Modifiers2 extends Zoo {
    public static void main(String[] args) {
        System.out.println("ACCESS MODIFIERS");
        Modifiers2 M2 = new Modifiers2();
        M2.Hello();
        Animal a = new Animal();
        a.animaltypes();
        a.

    }
}

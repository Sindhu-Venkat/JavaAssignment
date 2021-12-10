package com.exercises;

class Animal {
    int animalcount = 2;

    public void animaltypes() {
        System.out.println("AnimalTypes:" + animalcount);

        class Dog extends Animal {
            private int doglegs = 4;
            private void Dog() {
                System.out.println("Dog Legs:" + doglegs);
            }
            void show() {
                Dog d = new Dog();
                d.Dog();
            }
        }
        class Cat extends Animal {
            private int catlegs = 4;
            private void Cat() {
                System.out.println("Cat Legs:" + catlegs);
            }
            void show() {
                Cat c = new Cat();
                c.Cat();
            }
        }
    }

    void display() {            //default
        System.out.println("DEFAULT MODIFIER");
        
    }
}
public class Modifiers2 extends Zoo {
    public static void main(String[] args) {
        System.out.println("ACCESS MODIFIERS");
        Modifiers2 M2 = new Modifiers2();
        M2.Hello();
        Animal a = new Animal();
        a.display();
        a.animaltypes();

    }
}

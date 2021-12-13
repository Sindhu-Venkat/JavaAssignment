package com.exercises.accessmodifiers;

class Zoo {
//private accessed only within class
private int numberofanimals = 100;

private void numberofcount() {
        System.out.println("numberofcount =" + numberofanimals);
        }

        //default accessed only within same package
        void numberofanimals() {
        Zoo z1= new Zoo();
        z1.numberofcount();
        }
//accessed only within the same package or different subclass package
protected void Hello() {
        System.out.println("--->HELLO---<");
        }
        }
//public can be accessed everywhere in the pgm
    public class Modifiers{
        public static void main(String[] args) {
            System.out.println("WELCOME TO THE ZOO");
            Zoo z2 = new Zoo();
            z2.Hello();
            z2.numberofanimals();
        }
    }

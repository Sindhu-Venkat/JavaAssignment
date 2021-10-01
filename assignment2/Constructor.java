package com.assignment2;

public class Constructor {


        int x;    // instance variable
        static int y;    //static variable

        void add(){ // instance method
            int z;  // local variable
            z=x+y;
            System.out.println("ADDITION OF TWO NUMBERS = "+ z);
        }

        static void sub(){
            int z; //local variable
            Constructor c1 = new Constructor();
            z= c1.x-y;
            System.out.println("SUBTRACTION OF TWO NUMBERS ="+ z);

        }
        Constructor(){
            x = 8;
            y = 4;
        }

        public static void main(String[] args) {
            System.out.println("Hello");
            Constructor c2 = new Constructor();
            c2.add();
            Constructor.sub();
        }


    }


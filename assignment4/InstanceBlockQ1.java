package com.assignment4;

public class InstanceBlockQ1 {

        int dob = 2000;     // Instance variable
        static String name = "GGG";   //Static variable

    {
        System.out.println("Instance Block");   //Instance block
        int id = 50;
        System.out.println("STUDENT ID :" +id);
        System.out.println("STUDENT NAME : "+name);
        System.out.println("DATE OF BIRTH: " + dob);
        student();
        stud();
    }


    InstanceBlockQ1() {                      //constructor
        System.out.println("Constructor");
    }


        void student() {         // Instance Method
            System.out.println("Instance Method");
        }

        static void stud(){       //Static Method
            System.out.println("Static Method");
        }



        public static void main (String[] args){
            System.out.println("Hello");
            InstanceBlockQ1 IQ1 = new InstanceBlockQ1();
        }
    }




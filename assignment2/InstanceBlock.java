package com.assignment2;

public class InstanceBlock {

    int dob;     // Instance variable
    static String name;   //Static variable


    void student() {         // Instance Method
        System.out.println("Instance Method");
        System.out.println("DOB :" + dob);
    }

    static void stud(){       //Static Method
        System.out.println("Static Method");
        System.out.println("Student Name :" + name);
    }

    InstanceBlock() {       //constructor
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance Block");   //Instance block
        dob = 1999;   // local variable
        name = "GGG";
        float weight = 61;
        System.out.println("Weight in kg: " + weight);
    }

    public static void main (String[] args){
        System.out.println("Hello");
        InstanceBlock ib1 = new InstanceBlock();
        ib1.student();
        ib1.stud();

    }
}


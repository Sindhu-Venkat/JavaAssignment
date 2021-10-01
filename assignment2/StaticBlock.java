package com.assignment2;

public class StaticBlock {


    public int x;
    int id = 450;    //instance variable
    static String name;  //static variable

    static{
        System.out.println("Static Block");
        int rollno = 100;    //local variable
        System.out.println("Employee Roll No = "+ rollno);
        float salary = 30000;
        name = "luke";
        StaticBlock sb = new StaticBlock();
        sb.instance();
        StaticBlock.stat();

    }
    void instance(){
        System.out.println("Instance Method");
        System.out.println("Employee Id = "+ id);
    }

    static void stat(){
        System.out.println("Static Method");
        System.out.println("Student Name = "+ name);
    }

    StaticBlock(){
        System.out.println("Constructor");
    }


    public static void main(String[] args) {
        System.out.println("Hello");
    }

}


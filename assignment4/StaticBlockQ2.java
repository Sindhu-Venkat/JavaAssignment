package com.assignment4;

public class StaticBlockQ2 {

    static String name;  //static variable

    static{
        System.out.println("Static Block");
        int rollno = 100;    //local variable
        StaticBlockQ2 sq2 = new StaticBlockQ2();
        sq2.instance();
        StaticBlockQ2.stat();
        System.out.println("Employee Roll No = "+ rollno);
        float salary = 30000;
        name = "luke";
        System.out.println("Employee Name= "+ name);
        System.out.println("Employee salary ="+ salary);

    }

    void instance(){
        System.out.println("Instance Method");
    }

    static void stat(){
        System.out.println("Static Method");
    }

    StaticBlockQ2(){
        System.out.println("Constructor");
    }


    public static void main(String[] args) {
        System.out.println("Hello");
    }

}



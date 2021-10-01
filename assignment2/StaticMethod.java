package com.assignment2;

public class StaticMethod {

    int x;     // instance variable
    static int y; // static variable

    void instance(){     // Instance Method
        System.out.println("Instance Method Values");
        x= 2;      //local variable
        System.out.println("x = "+ x);
        y = 4;
        System.out.println("y = "+ y);
        int z = 6;
        System.out.println("z ="+ z);

    }

    static void stat(){  // static method
        System.out.println("Static Method Values");
        StaticBlock sb1 = new StaticBlock();
        sb1.x = 8;
        System.out.println("x=" +sb1.x);
        y = 10;
        int z = 12;
        System.out.println("y=" + y);
        System.out.println("z ="+z);
    }

    public static void main(String[] args) {
        StaticMethod sb = new StaticMethod();
        sb.instance();
        StaticMethod.stat();


    }
}

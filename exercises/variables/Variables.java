package com.exercises.variables;

public class Variables {

    int i = 10;             //instance variable
    static int j = 100;   //static variable


    public static void main(String[] args) {

        System.out.println("Types Of Variables");
        int k = 1000;                                    //local variable
        System.out.println("Local variable=" + k);
        Variables vEx = new Variables();                // object creation
        System.out.println("Instance Variable=" +vEx.i);
        System.out.println("Static Variable=" + vEx.j);   //using objectname
        System.out.println("Static Variable="+ j);     // direct access
        System.out.println("Static Variable="+Variables.j); //using classname




    }
}
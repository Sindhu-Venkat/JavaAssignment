package com.exercises.datatypes;
//. Write a program to find the average of the given 3 double values?
//	a=10.5, b=15.4, c=24.1

class Avg1{
    double a ;
    double b ;
    double c ;
    double averesult;
}
public class Average{

    static double a = 10.5;
    static double b = 15.4;
    static double c = 24.1;

    public static void main(String[] args) {
        System.out.println("AVERAGE OF THREE DOUBLE NUMBERS :");
        double averesult = (a+b+c)/3;
        System.out.println(" TOTAL AVERAGE :"+ averesult);
    }

}

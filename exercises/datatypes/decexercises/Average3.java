package com.exercises.datatypes.decexercises;
//. Write a program to find the average of the given 3 double values?
//	a=10.5, b=15.4, c=24.1

public class Average3 {

    double a = 10.5;                    //given double values
    double b = 15.4;
    double c = 24.1;

    public double display() {

        double averesult = (a + b + c) / 3;        //average logic
        return averesult;                    // "averesult" variable result
    }

    public static void main(String[] args) {
        System.out.println("AVERAGE OF THREE DOUBLE NUMBERS :");
        Average3 av3 = new Average3();
        double averesult = av3.display();
        System.out.println("TOTAL AVERAGE :"+av3.display());
    }
}


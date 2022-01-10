package com.exercises.datatypes;

import java.util.Scanner;

class AverageLogic {

    public double display(double a, double b, double c) {          //Average1 method
        return (a + b + c) / 3;
    }

    public double display1(double n) {             //Average2 method
        Scanner sc = new Scanner(System.in);
        double result = 0;
        for (double i = 1; i <= n; i++) {
            System.out.print("enter the numbers:");
            double number = sc.nextDouble();
            result = (number + result)/n;
        }
        return result;
    }
}




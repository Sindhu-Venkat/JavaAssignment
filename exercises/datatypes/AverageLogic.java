package com.exercises.datatypes;

import java.util.Scanner;

class AverageLogic {
    public double display(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public double display() {
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total numbers to be entered :");
        n = sc.nextInt();
        double result = 0;
        for (i = 1; i <= n; i++) {
            System.out.println("Enter the numbers :");
            int number = sc.nextInt();
            result = number + result;
        }
        return result/n;
    }
}




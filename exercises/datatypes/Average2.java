package com.exercises.datatypes;

// 7. Write a program to find the average of the given n number of double values

import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {
        System.out.println("AVERAGE OF N DOUBLE VALUES:");
        double n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total numbers to be entered :");
        n = sc.nextDouble();
        double result = 0;
        AverageLogic al = new AverageLogic();
        for (double i = 1; i <= n; i++) {
            System.out.println("Enter the numbers :");
            double number = sc.nextDouble();
            result = number + result;
        }
            double sumAverage = al.display(result/n);
            System.out.println("The total average is :" + sumAverage);
        }
    }


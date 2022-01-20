package com.exercises.datatypes.decexercises;

import com.exercises.datatypes.decexercises.AverageLogic;

import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {
        System.out.println("AVERAGE OF N DOUBLE VALUES:");
        double n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total numbers to be entered:");
        n=sc.nextDouble();
        AverageLogic al = new AverageLogic();
        double sumAverage = al.display1(n);
        System.out.println("The total average is :"+ sumAverage);
    }
}

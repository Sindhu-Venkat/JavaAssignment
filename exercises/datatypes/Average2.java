package com.exercises.datatypes;

// 7. Write a program to find the average of the given n number of double values

public class Average2{
    public static void main(String[] args) {
        System.out.println("AVERAGE OF N DOUBLE VALUES:");
       AverageLogic al = new AverageLogic();
       double sumAverage = al.display();
        System.out.println("The total average is :"+sumAverage);
    }
}
package com.exercises.datatypes;

//2. Write a java program to that reads an integer and check whether it is negative,zero or positive.

import java.util.Scanner;

public class IntegerConditional {

    public static void main(String[] args) {
        System.out.println("** WELCOME **");
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer:");
        n = sc.nextInt();
        CCLogic c = new CCLogic();
        int finalValue = c.show(n);
        System.out.println("THE GIVEN INTEGER IS :"+finalValue);
    }
}

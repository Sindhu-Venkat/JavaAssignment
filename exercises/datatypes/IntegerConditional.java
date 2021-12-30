package com.exercises.datatypes;

//2. Write a java program to that reads an integer and check whether it is negative,zero or positive.

import java.util.Scanner;

public class IntegerConditional {

    public static void main(String[] args) {
        System.out.println("** WELCOME **");
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer:");
        n = sc.nextInt();
        if(n>0){
            System.out.println("INTEGER IS POSITIVE");
        }
        else if(n<0){
            System.out.println("INTEGER IS NEGATIVE");
        }
        else{
            System.out.println("INTEGER IS ZERO");
        }
        CCLogic c = new CCLogic();
        int finalValue = c.show(n);
        System.out.println("THE GIVEN INTEGER IS :"+finalValue);
    }
}

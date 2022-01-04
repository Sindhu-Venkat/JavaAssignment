package com.exercises.datatypes;

//1. Write a Java program to take three i/p integers from the user and print the greatest number.

import java.util.Scanner;

public class GreatestConditional {
    public static void main(String[] args) {
        System.out.println("** GREATEST OF THREE INTEGERS **:");
        int a,b,c,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        a = sc.nextInt();
        System.out.println("Enter second number:");
        b = sc.nextInt();
        System.out.println("Enter third number:");
        c = sc.nextInt();
        temp = c >(a>b?a:b)?c:((a>b)?a:b);
        CCLogic cc = new CCLogic();
        int result = cc.display(temp);
        System.out.println("The greatest of all is "+result);
        }
    }


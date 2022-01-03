package com.exercises.datatypes;

//1. Write a Java program to take three i/p integers from the user and print the greatest number.

import java.util.Scanner;

public class GreatestConditional {
    public static void main(String[] args) {
        System.out.println("** GREATEST OF THREE INTEGERS **:");
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENTER THREE INTEGERS :");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a>b && a>c){
            System.out.println(a + "is the greatest number");
        }
        else if(b>a && b>c){
            System.out.println(b+ "is the greatest number");
        }
        else if (c>a && c>b){
            System.out.println(c + "is the greatest number");
        }
        CCLogic cc = new CCLogic();
        int GreatestNumber = cc.display(a,b,c);
        System.out.println("The Greatest of three numbers is :"+GreatestNumber);
    }
}

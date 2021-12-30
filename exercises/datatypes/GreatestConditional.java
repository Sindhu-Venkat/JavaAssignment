package com.exercises.datatypes;

//1. Write a Java program to take three i/p integers from the user and print the greatest number.

import java.util.Scanner;

public class GreatestConditional {
    public static void main(String[] args) {
        System.out.println("** GREATEST OF THREE INTEGERS **:");
        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENTER THREE INTEGERS :");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        if(num1>num2 && num1>num3){
        }
        else if(num2>num1 && num2>num3){
        }
        else if(num3>num1 && num3>num2){
        }
        CCLogic c = new CCLogic();
        int GreatestNumber = c.display(num1,num2,num3);
        System.out.println("The Greatest of three numbers is :"+GreatestNumber);
    }
}

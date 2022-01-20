package com.exercises.datatypes.decexercises;

//1. Write a Java program to take three i/p integers from the user and print the greatest number.


import com.exercises.datatypes.decexercises.CCLogic;

public class GreatestConditional {
    public static void main(String[] args) {
        System.out.println("** GREATEST OF THREE INTEGERS **:");
        CCLogic cc = new CCLogic();
        int tempValue=0;
        int result = cc.greatest(tempValue);
        System.out.println("The greatest of all is "+result);

    }
    }


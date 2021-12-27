package com.exercises.datatypes;

//Write a Java program to check if a given positive number is a palindrome or not


public class Palindrome {

    protected void display(int num) {
        int rev = 0, rem;
        rem = num % 10;
        rev = (rev * 10) + rem;
        System.out.println("Reversed integer:" + rev);
        num = num /= 10;
    }
}
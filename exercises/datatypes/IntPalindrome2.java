package com.exercises.datatypes;

//Write a Java program to check if a given positive number is a palindrome or not

import java.util.Scanner;

public class IntPalindrome2 {

    public static void main(String[] args) {
        System.out.println("<===INTEGER PALINDROME===>");
        int num,rev=0,rem;     //positive integer // rev - reverse , //rem - remainder
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO BE REVERSED :");
        num = sc.nextInt();
        int temp = num;
        Palindromelogic pl = new Palindromelogic();
        pl.display(num);
        if(temp == rev){        //using if else condition checking whether the num is palindrome or not.
            System.out.println("IS A PALINDROME");
        }
        else{
            System.out.println("NOT A PALINDROME");
        }
    }
}


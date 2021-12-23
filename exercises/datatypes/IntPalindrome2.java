package com.exercises.datatypes;

//Write a Java program to check if a given positive number is a palindrome or not

public class IntPalindrome2 {

    public static void main(String[] args) {
        System.out.println("<===INTEGER PALINDROME===>");

        int num = 121;     //positive integer
        int rev= 0,rem;    // rev - reverse , //rem - remainder

        int temp = num;   //introducing a temp variable and assigning it to num.
        while(temp>0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if(num == rev){             //using if else condition checking whether the num is palindrome or not.
            System.out.println("IS A PALINDROME");
        }
        else{
            System.out.println("NOT A PALINDROME");
        }
    }
}


package com.exercises.datatypes;

//Write a Java program to check if a given positive number is a palindrome or not

import java.util.Scanner;

public class IntPalindrome2 {
    public static void main(String[] args) {
        System.out.println("<===INTEGER PALINDROME===>");
        int r=0, rem, num;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number that has to be checked:");
        num = s.nextInt();
        while( num != 0 )
        {
            rem= num % 10;
            r= r * 10 + rem;
            num=num/10;
        }
        Palindromelogic pl = new Palindromelogic();
        int temp = num;
        int palindromeResult = r;
        System.out.println("PALINDROME RESULT :"+palindromeResult);
        if (temp == r)
        {
            System.out.println( + r + ":IS A PALINDROME");
        }
        else
        {
            System.out.println( + r + ":NOT A PALINDROME");
        }
    }
}

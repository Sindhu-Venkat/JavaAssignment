package com.exercises.datatypes;

//6.Write a Java program to check if a given positive number is a palindrome or not


public class IntPalindrome2 {
    public static void main(String[] args) {
        System.out.println("<===INTEGER PALINDROME===>");
        Palindromelogic pl = new Palindromelogic();
        int num=0;
        int palindromeResult = pl.display(num);
        System.out.println("PALINDROME RESULT :"+palindromeResult);
    }
}

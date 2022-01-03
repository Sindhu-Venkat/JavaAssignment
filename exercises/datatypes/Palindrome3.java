package com.exercises.datatypes;

//4.Write a Java program to check if a given positive number is a palindrome or not
//5.Write a Java program to check if a given string is a palindrome or not

import java.util.Scanner;

public class Palindrome3 {
    public static void main(String[] args) {
        System.out.println("-->WELCOME<--");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number or string :");
        String reverse = "";
        String num = sc.nextLine();
        int length = num.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + num.charAt(i);
        }
        System.out.println("REVERSE:" + reverse);
        if (reverse.equals(num)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}




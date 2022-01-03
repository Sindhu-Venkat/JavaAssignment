package com.exercises.datatypes;

//4.Write a Java program to check if a given positive number is a palindrome or not
//5.Write a Java program to check if a given string is a palindrome or not

import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {
        System.out.println("<---HELLO--->");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number or string : ");
        String reverse = "";
        String num = sc.nextLine();
        int length = num.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + num.charAt(i);
        System.out.println("REVERSE:" + reverse);
        if (num.equals(reverse))
            System.out.println("The entered input " + num + " is a palindrome.");
        else
            System.out.println("The entered input " + num + "  isn't a palindrome.");
        Palindromelogic pl = new Palindromelogic();
        String result = pl.show(num);
        System.out.println("Final result :"+result);
    }
}








package com.exercises.datatypes.decexercises;

//Write a Java program to check if a given positive number is a palindrome or not

import java.util.Scanner;

class Palindromelogic {

    public int display(int num) {                       //IntPalindrome2
        int rev=0, rem;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number that has to be checked:");
        num = s.nextInt();
        int temp = num;
        while( num != 0 )
        {
            rem= num % 10;
            rev= rev * 10 + rem;
            num=num/10;
        }
        System.out.println("Reverse:"+rev);
        if (temp == rev) {
            boolean isPrime = true;
            System.out.println("IS A PALINDROME");
        }
        else {
            boolean isPrime = false;
            System.out.println("NOT A PALINDROME");
        }
        return rev;

    }

    public String show(String num) {                         //palindrome3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number or string:");
        String reverse = "";
        num = sc.nextLine();
        int length = num.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + num.charAt(i);
        }
        System.out.println("Reverse :" + reverse);
        if (num.equals(reverse)) {
            boolean isPrime = true;
            System.out.println("Is a palindrome");
        } else {
            boolean isPrime = false;
            System.out.println("Not a palindrome");
        }
        return reverse;
    }
}










package com.exercises.datatypes;

//Write a Java program to check if a given positive number is a palindrome or not

import java.util.Scanner;

class Palindromelogic {

    public int display() {

        int r=0, rem, num;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number that has to be checked:");
        num = s.nextInt();
        int temp = num;
        while( num != 0 )
        {
            rem= num % 10;
            r= r * 10 + rem;
            num=num/10;
        }
        return r;
    }
}






package com.exercises.datatypes;

//Write a Java program to check if a given positive number is a palindrome or not

class Palindromelogic {
    public int display( int num) {
        int rev = 0, rem;
        while (num != 0) {
            rem = num % 10;
            rev = rem;             // rev = rev * 10 +rem)
            num = num / 10;
        }
        System.out.println("REVERSE RESULT 1 :" + rev);
        return rev;
    }
}








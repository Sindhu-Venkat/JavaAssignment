package com.exercises.datatypes;

//Write a Java program to check if a given positive number is a palindrome or not
//Write a Java program to check if a given string is a palindrome or not

class GrandParent {
    void show() {
        int num = 121;     //positive integer
        int rev = 0;
        int rem;    // rev - reverse , //rem - remainder
        System.out.println(num);
        while (num > 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
            if (num == rev) {             //using if else condition checking whether the num is palindrome or not.
                System.out.println("IS A PALINDROME");
            } else {
                System.out.println("NOT A PALINDROME");
            }
        }
    }
}

    class Parent extends GrandParent {
        void display() {
            String str1 = "DOG";
            System.out.println(str1);
            String rev = "";
            int length = str1.length();
            for (int i = str1.length() - 1; i >=0; i--) {
                rev = rev + str1.charAt(i);
                System.out.println(rev);
            }
            if (str1 == rev) {
                System.out.println("STRING IS PALINDROME");
            } else {
                System.out.println("STRING IS NOT PALINDROME");
            }
        }
    }

    public class Palindrome1 extends GrandParent {
        public static void main(String[] args) {
            System.out.println("<---HELLO--->");
            Parent p = new Parent();
            System.out.println("****INTEGER PALINDROME****");
            p.show();
            System.out.println("****STRING PALINDROME****");
            p.display();


        }
    }







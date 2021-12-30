package com.exercises.datatypes;

//Write a Java program to check if a given positive number is a palindrome or not
//Write a Java program to check if a given string is a palindrome or not

import java.util.Scanner;

class GrandParent {
    void show(){
            int num,r = 0,rev = 0,rem;     //positive integer
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER THE NUMBER TO BE REVERSED :");
            num = sc.nextInt();
            while( num != 0 )
            {
                rem= num % 10;
                r= r * 10 + rem;
                num=num/10;
            }
            Palindromelogic pl = new Palindromelogic();
            int temp = num;
            int intResult = pl.display(r);
            System.out.println("PALINDROME RESULT :"+intResult);
            if (temp == r) {             //using if else condition checking whether the num is palindrome or not.
                System.out.println(" Entered Integer is a Palindrome");
            } else {
                System.out.println(" Entered Integer is not a Palindrome");
            }
        }
    }
    class Parent extends GrandParent {
        void display() {
            String str, strrev = "";
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string :");
            str = sc.next();
            for (int i = str.length() - 1; i >= 0; i--) {
                strrev = strrev + str.charAt(i);
            }
            Palindromelogic pl = new Palindromelogic();
            System.out.println("Reverse of a string is : " + strrev);
            String strResult = pl.display(strrev);
            System.out.println("PALINDROME RESULT :" + strResult);
            if (strrev == str) {
                System.out.println("Entered string is palindrome");
            } else {
                System.out.println("Entered string is not a palindrome");
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








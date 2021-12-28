package com.exercises.datatypes;

//Write a Java program to check if a given positive number is a palindrome or not
//Write a Java program to check if a given string is a palindrome or not

import java.util.Scanner;

class GrandParent {
        void show(){
            int num ,rev = 0,rem;     //positive integer
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER THE NUMBER TO BE REVERSED :");
            num = sc.nextInt();
            for(rev=0;num>0;num/=10){
                rem = num % 10;
                rev = rem;
                num = num /10;
            }
            System.out.println(rev);
            if (num == rev) {             //using if else condition checking whether the num is palindrome or not.
                System.out.println("IS A PALINDROME");
            } else {
                System.out.println("NOT A PALINDROME");
            }
        }
    }
    class Parent extends GrandParent{
        void display(){
            String str1,rev =" ";
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER THE STRING TO BE REVERSED :");
            str1= sc.nextLine();
            int length = str1.length();
            for(int i = str1.length()-1; i>=0; i--){
                rev = rev + str1.charAt(i);
                }
            System.out.println(rev);
            if(str1 == rev){
                System.out.println("STRING IS PALINDROME");
            }
            else{
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







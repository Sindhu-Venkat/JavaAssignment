package com.exercises.datatypes;

    class GrandParent {
        static int num = 543;     //positive integer
        static int rev = 0;
        static int rem;    // rev - reverse , //rem - remainder
        static int temp = num;   //introducing a temp variable and assigning it to num.
    }
    class Parent extends GrandParent{
        String str1 = "SGS";
        void display(){
            int length = str1.length();
            for(int i = length-1;i>=0;i--){
                rev = rev + str1.charAt(i);
                }
            }
        }
    public class Palindrome1 extends GrandParent {
        public static void main(String[] args) {
            System.out.println("<---HELLO--->");
            System.out.println("****INTEGER PALINDROME****");
            while (temp > 0) {
                rem = temp % 10;
                rev = rev * 10 + rem;
                temp = temp / 10;
            }
            if (num == rev) {             //using if else condition checking whether the num is palindrome or not.
                System.out.println("IS A PALINDROME");
            } else {
                System.out.println("NOT A PALINDROME");
            }
            System.out.println("****STRING PALINDROME****");
            Parent P = new Parent();


        }
    }







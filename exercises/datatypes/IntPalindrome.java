package com.exercises.datatypes;

import java.util.Scanner;

class Palindrome{
    int rev ,rem,num;
     void display(){
         rem = num % 10;
         rev = (rev * 10) + rem;
         num= num /10;
     }
}
public class IntPalindrome {

    public static void main(String[] args) {
        System.out.println("<===INTEGER PALINDROME===>");
        int num=0;
        int rev= 0,rem;    // rev - reverse , //rem - remainder
        int temp = num;   //introducing a temp variable and assigning it to num.
        Palindrome p = new Palindrome();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO BE REVERSED :");
        num = sc.nextInt();
        for(rev=0;num>0; num/=10) {
           p.display();
        }
        if(num == rev){     //using if else condition checking whether the num is palindrome or not.
            System.out.println("IS A PALINDROME");
        }
        else{
            System.out.println("NOT A PALINDROME");
        }
    }
}

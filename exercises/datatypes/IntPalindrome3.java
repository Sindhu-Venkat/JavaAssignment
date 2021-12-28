package com.exercises.datatypes;
import java.util.Scanner;
public class IntPalindrome3 extends Palindromelogic {
        public static void main(String[] args) {
            System.out.println("<===INTEGER PALINDROME===>");
            int num2, rev = 0, rem, num1 = 121;
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER THE NUMBER TO BE REVERSED :");
            num2 = sc.nextInt();
            int temp = num2;
            IntPalindrome3 ip3 = new IntPalindrome3();
            System.out.println("NUM1 :" + num1);
            System.out.println("NUM2 :" + num2);
            ip3.display(num2);
            System.out.println("REVERSE RESULT 1:"+num1);
            while (num2 != 0) {
                rem = num2 % 10;
                rev = rem;             // rev = rev * 10 +rem)
                num2 = num2 / 10;
                System.out.println("REVERSE RESULT 2:" + rev);
            }

            if(num1 == temp){     //using if else condition checking whether the num is palindrome or not.
                System.out.println("IS A PALINDROME");
            }
            else{
                System.out.println("NOT A PALINDROME");
            }
        }
    }



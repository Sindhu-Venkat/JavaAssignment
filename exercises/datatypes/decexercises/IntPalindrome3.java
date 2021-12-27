package com.exercises.datatypes.decexercises;
import com.exercises.datatypes.Palindrome;
import com.exercises.datatypes.Palindrome.*;

import java.util.Scanner;
public class IntPalindrome3 extends Palindrome {
    public static void main(String[] args) {
        System.out.println("<===INTEGER PALINDROME===>");
        int num,rev=0,rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO BE REVERSED :");
        num = sc.nextInt();
        IntPalindrome3 ip3 = new IntPalindrome3();
        for(rev=0; num >4; num/=10){
            ip3.display(num);
            System.out.println("NUM :"+num);
        }
        if(num == rev){     //using if else condition checking whether the num is palindrome or not.
            System.out.println("IS A PALINDROME");
        }
        else{
            System.out.println("NOT A PALINDROME");
        }
    }
}

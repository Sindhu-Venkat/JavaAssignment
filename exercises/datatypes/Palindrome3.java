package com.exercises.datatypes;

import java.util.Scanner;

public class Palindrome3 {
    public static void main(String[] args) {
        System.out.println("-->WELCOME<--");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number or string :");
        String reverse = "";
        String num = sc.nextLine();
        int length = num.length();
        for (int i = length - 1; i >= 0; i--){
            boolean temp=checkPalindrome(i);
            if(checkPalindrome(i))
                System.out.print(i+" ");
        }
    }
    public static boolean checkPalindrome(int num)
    {
        int r,sum=0;
        int temp=num;
        while(num>0)
        {
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(temp==sum)
            return true;
        else
            return false;
    }
}


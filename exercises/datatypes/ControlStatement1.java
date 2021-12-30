package com.exercises.datatypes;

// 1.write a program to find the number of characters from the given i/p string.

import java.util.Scanner;

public class ControlStatement1 {
    public static void main(String[] args) {
        System.out.println("**NUMBER OF CHARACTERS**");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String input = sc.nextLine();
        int count = 1;
        for(int i = 1; i < input.length(); i++){
            if ((input.charAt(i) != ' '))
                count++;
        }
        CCLogic cc = new CCLogic();
        int totalCount = cc.display(count);
        System.out.println("THE TOTAL NUMBER OF CHARACTERS IN THE GIVEN STRING INPUT IS :"+totalCount);
    }
}
